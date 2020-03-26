package com.qualcomm.qti.internal.telephony;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncResult;
import android.os.Handler;
import android.os.Message;
import android.os.Registrant;
import android.os.RegistrantList;
import android.os.RemoteException;
import android.telephony.Rlog;
import android.text.TextUtils;
import com.qualcomm.qcrilhook.IQcRilHook;
import com.qualcomm.qcrilhook.OemHookCallback;
import com.qualcomm.qcrilhook.QcRilHook;
import com.qualcomm.qcrilhook.QcRilHookCallback;
import com.qualcomm.qti.internal.telephony.QtiUiccCardProvisioner;
import com.qualcomm.qti.internal.telephony.uicccontact.QtiSimPhoneBookAdnRecord;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.codeaurora.internal.IDepersoResCallback;

public class QtiRilInterface implements BaseRilInterface {
    private static final int BYTE_SIZE = 1;
    private static final int INT_SIZE = 4;
    private static final String LOG_TAG = "QtiRilInterface";
    private static final char NULL_TERMINATOR = '\u0000';
    private static final int NULL_TERMINATOR_LENGTH = 1;
    private static final int SHORT_SIZE = 2;
    /* access modifiers changed from: private */
    public static boolean mIsServiceReady = false;
    /* access modifiers changed from: private */
    public static QtiRilInterface sInstance = null;
    private final String ACTION_ADN_INIT_DONE = "qualcomm.intent.action.ACTION_ADN_INIT_DONE";
    private final String ACTION_ADN_RECORDS_IND = "qualcomm.intent.action.ACTION_ADN_RECORDS_IND";
    /* access modifiers changed from: private */
    public RegistrantList mAdnInitDoneRegistrantList;
    /* access modifiers changed from: private */
    public RegistrantList mAdnRecordsInfoRegistrantList;
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            QtiRilInterface qtiRilInterface = QtiRilInterface.this;
            qtiRilInterface.logd("Received " + intent.getAction());
            if ("qualcomm.intent.action.ACTION_ADN_INIT_DONE".equals(intent.getAction())) {
                QtiRilInterface.this.mAdnInitDoneRegistrantList.notifyRegistrants(new AsyncResult((Object) null, (Object) null, (Throwable) null));
            } else if ("qualcomm.intent.action.ACTION_ADN_RECORDS_IND".equals(intent.getAction())) {
                QtiRilInterface.this.mAdnRecordsInfoRegistrantList.notifyRegistrants(new AsyncResult((Object) null, QtiRilInterface.this.responseAdnRecords(intent.getByteArrayExtra("adn_records")), (Throwable) null));
            }
        }
    };
    private QcRilHook mQcRilHook;
    private QcRilHookCallback mQcrilHookCb = new QcRilHookCallback() {
        public void onQcRilHookReady() {
            boolean unused = QtiRilInterface.mIsServiceReady = true;
            QtiRilInterface.this.logd("Service ready, notifying registrants");
            QtiRilInterface.this.mServiceReadyRegistrantList.notifyRegistrants(new AsyncResult((Object) null, Boolean.valueOf(QtiRilInterface.mIsServiceReady), (Throwable) null));
        }

        public synchronized void onQcRilHookDisconnected() {
            boolean unused = QtiRilInterface.mIsServiceReady = false;
            QtiRilInterface.this.logd("Service disconnected, notifying registrants");
            QtiRilInterface.this.mServiceReadyRegistrantList.notifyRegistrants(new AsyncResult((Object) null, Boolean.valueOf(QtiRilInterface.mIsServiceReady), (Throwable) null));
            QtiRilInterface unused2 = QtiRilInterface.sInstance = null;
        }
    };
    /* access modifiers changed from: private */
    public RegistrantList mServiceReadyRegistrantList;

    public static synchronized QtiRilInterface getInstance(Context context) {
        QtiRilInterface qtiRilInterface;
        synchronized (QtiRilInterface.class) {
            if (sInstance == null) {
                sInstance = new QtiRilInterface(context);
            }
            qtiRilInterface = sInstance;
        }
        return qtiRilInterface;
    }

    private QtiRilInterface(Context context) {
        logd(" in constructor ");
        this.mServiceReadyRegistrantList = new RegistrantList();
        this.mAdnInitDoneRegistrantList = new RegistrantList();
        this.mAdnRecordsInfoRegistrantList = new RegistrantList();
        try {
            this.mQcRilHook = new QcRilHook(context, this.mQcrilHookCb);
        } catch (SecurityException se) {
            loge("SecurityException during QcRilHook init: " + se);
            mIsServiceReady = false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("qualcomm.intent.action.ACTION_ADN_INIT_DONE");
        intentFilter.addAction("qualcomm.intent.action.ACTION_ADN_RECORDS_IND");
        context.registerReceiver(this.mBroadcastReceiver, intentFilter);
    }

    public QtiUiccCardProvisioner.UiccProvisionStatus getUiccProvisionPreference(int phoneId) {
        QtiUiccCardProvisioner.UiccProvisionStatus provStatus = new QtiUiccCardProvisioner.UiccProvisionStatus();
        org.codeaurora.telephony.utils.AsyncResult ar = this.mQcRilHook.sendQcRilHookMsg((int) IQcRilHook.QCRIL_EVT_HOOK_GET_UICC_PROVISION_PREFERENCE, new byte[0], phoneId);
        if (ar.exception == null && ar.result != null) {
            ByteBuffer byteBuf = ByteBuffer.wrap((byte[]) ar.result);
            byteBuf.order(ByteOrder.nativeOrder());
            logd("Data received: " + byteBuf.toString());
            provStatus.setUserPreference(byteBuf.getInt());
            provStatus.setCurrentState(byteBuf.getInt());
        }
        logi("get pref, phoneId " + phoneId + " " + provStatus + " exception " + ar.exception);
        return provStatus;
    }

    private class DepersoCallback extends OemHookCallback {
        int ERROR = 1;
        int SUCCESS = 0;
        IDepersoResCallback depersoCallBack;

        public DepersoCallback(IDepersoResCallback callback, Message msg) {
            super(msg);
            this.depersoCallBack = callback;
        }

        public void onOemHookResponse(byte[] response, int phoneId) throws RemoteException {
            if (response != null) {
                QtiRilInterface.this.logd("DepersoResult SUCCESS");
                this.depersoCallBack.onDepersoResult(this.SUCCESS, phoneId);
                return;
            }
            QtiRilInterface.this.logd("DepersoResult ERROR");
            this.depersoCallBack.onDepersoResult(this.ERROR, phoneId);
        }

        public void onOemHookException(int phoneId) throws RemoteException {
            QtiRilInterface.this.logd("DepersoResult ERROR");
            this.depersoCallBack.onDepersoResult(this.ERROR, phoneId);
        }
    }

    public void supplyIccDepersonalization(String netpin, String type, IDepersoResCallback callback, int phoneId) {
        logd("supplyDepersonalization: netpin = " + netpin + " type = " + type + "phoneId = " + phoneId);
        Message msg = Message.obtain();
        int i = 1;
        int length = type.length() + 1;
        if (netpin != null) {
            i = 1 + netpin.length();
        }
        byte[] payload = new byte[(length + i)];
        QcRilHook qcRilHook = this.mQcRilHook;
        ByteBuffer buf = QcRilHook.createBufferWithNativeByteOrder(payload);
        buf.put(type.getBytes());
        buf.put((byte) 0);
        if (netpin != null) {
            buf.put(netpin.getBytes());
        }
        buf.put((byte) 0);
        this.mQcRilHook.sendQcRilHookMsgAsync(IQcRilHook.QCRIL_EVT_HOOK_ENTER_DEPERSONALIZATION_CODE, payload, new DepersoCallback(callback, msg), phoneId);
    }

    public String getUiccIccId(int phoneId) {
        byte[] requestData = new byte[4];
        QcRilHook qcRilHook = this.mQcRilHook;
        QcRilHook.createBufferWithNativeByteOrder(requestData).putInt(phoneId);
        org.codeaurora.telephony.utils.AsyncResult ar = this.mQcRilHook.sendQcRilHookMsg((int) IQcRilHook.QCRIL_EVT_HOOK_GET_UICC_ICCID, requestData, phoneId);
        if (ar.exception != null || ar.result == null) {
            return null;
        }
        return new String((byte[]) ar.result);
    }

    public int getMaxDataAllowed() {
        int maxData = 0;
        org.codeaurora.telephony.utils.AsyncResult ar = this.mQcRilHook.sendQcRilHookMsg(IQcRilHook.QCRIL_EVT_HOOK_GET_MAX_DATA_ALLOWED);
        if (ar.exception == null && ar.result != null) {
            maxData = ByteBuffer.wrap((byte[]) ar.result).get();
        }
        logi("getMaxDataAllowed maxData = " + maxData + " exception: " + ar.exception);
        return maxData;
    }

    public boolean getLpluslSupportStatus() {
        boolean status = false;
        org.codeaurora.telephony.utils.AsyncResult ar = this.mQcRilHook.sendQcRilHookMsg(IQcRilHook.QCRIL_EVT_REQ_HOOK_GET_L_PLUS_L_FEATURE_SUPPORT_STATUS_REQ);
        if (ar.exception == null && ar.result != null) {
            boolean z = true;
            if ((ByteBuffer.wrap((byte[]) ar.result).get() & 1) != 1) {
                z = false;
            }
            status = z;
        }
        logi("getLpluslSupportStatus: " + status + " exception: " + ar.exception);
        return status;
    }

    public void sendPhoneStatus(int isReady, int phoneId) {
        byte[] requestData = new byte[1];
        QcRilHook qcRilHook = this.mQcRilHook;
        QcRilHook.createBufferWithNativeByteOrder(requestData).put((byte) isReady);
        org.codeaurora.telephony.utils.AsyncResult sendQcRilHookMsg = this.mQcRilHook.sendQcRilHookMsg((int) IQcRilHook.QCRIL_EVT_HOOK_SET_ATEL_UI_STATUS, requestData, phoneId);
    }

    public boolean setUiccProvisionPreference(int userPref, int phoneId) {
        boolean retval = false;
        byte[] requestData = new byte[8];
        QcRilHook qcRilHook = this.mQcRilHook;
        ByteBuffer reqBuffer = QcRilHook.createBufferWithNativeByteOrder(requestData);
        reqBuffer.putInt(userPref);
        reqBuffer.putInt(phoneId);
        org.codeaurora.telephony.utils.AsyncResult ar = this.mQcRilHook.sendQcRilHookMsg((int) IQcRilHook.QCRIL_EVT_HOOK_SET_UICC_PROVISION_PREFERENCE, requestData, phoneId);
        if (ar.exception == null) {
            retval = true;
        }
        logi("set provision userPref " + userPref + " phoneId " + phoneId + " exception: " + ar.exception);
        return retval;
    }

    /* access modifiers changed from: private */
    public int[] parseInts(byte[] buffer, int numInts) {
        ByteBuffer byteBuf = ByteBuffer.wrap(buffer);
        byteBuf.order(ByteOrder.nativeOrder());
        logi("numInts: " + numInts);
        int[] response = new int[numInts];
        for (int i = 0; i < numInts; i++) {
            response[i] = byteBuf.getInt();
            logi("response[i]: " + response[i]);
        }
        return response;
    }

    protected class AdnOemHookCallback extends OemHookCallback {
        Message mAppMessage;
        int mRspLength;

        public AdnOemHookCallback(Message msg, int length) {
            super(msg);
            this.mAppMessage = msg;
            this.mRspLength = length;
        }

        public void onOemHookResponse(byte[] response, int phoneId) throws RemoteException {
            if (response != null) {
                QtiRilInterface qtiRilInterface = QtiRilInterface.this;
                qtiRilInterface.logd("AdnOemHookCallback: onOemHookResponse = " + response.toString());
                AsyncResult.forMessage(this.mAppMessage, QtiRilInterface.this.parseInts(response, this.mRspLength), (Throwable) null);
            } else {
                AsyncResult.forMessage(this.mAppMessage, (Object) null, new Exception("QCRIL_EVT_HOOK_GET_ADN_RECORD failed"));
            }
            this.mAppMessage.sendToTarget();
        }

        public void onOemHookException(int phoneId) throws RemoteException {
            QtiRilInterface.this.logd("AdnOemHookCallback: onOemHookException");
            AsyncResult.forMessage(this.mAppMessage, (Object) null, new Exception("com.android.internal.telephony.CommandException: MODEM_ERR"));
            this.mAppMessage.sendToTarget();
        }
    }

    public void getAdnRecord(Message callbackMsg, int phoneId) {
        byte[] requestData = new byte[4];
        QcRilHook qcRilHook = this.mQcRilHook;
        QcRilHook.createBufferWithNativeByteOrder(requestData).putInt(phoneId);
        this.mQcRilHook.sendQcRilHookMsgAsync(IQcRilHook.QCRIL_EVT_HOOK_GET_ADN_RECORD, requestData, new AdnOemHookCallback(callbackMsg, 10), phoneId);
        logi("getAdnRecord()");
    }

    public void updateAdnRecord(QtiSimPhoneBookAdnRecord adnRecordInfo, Message callbackMsg, int phoneId) {
        int numEmails = adnRecordInfo.getNumEmails();
        int numAdNumbers = adnRecordInfo.getNumAdNumbers();
        String name = adnRecordInfo.getAlphaTag();
        String number = adnRecordInfo.getNumber();
        int dataSize = (TextUtils.isEmpty(name) ? 0 : name.getBytes().length + 1) + 10 + (TextUtils.isEmpty(number) ? 0 : number.getBytes().length + 1);
        for (int i = 0; i < numEmails; i++) {
            dataSize = dataSize + 2 + adnRecordInfo.getEmails()[i].getBytes().length + 1;
        }
        int dataSize2 = dataSize;
        for (int j = 0; j < numAdNumbers; j++) {
            dataSize2 = dataSize2 + 2 + adnRecordInfo.getAdNumbers()[j].getBytes().length + 1;
        }
        byte[] requestData = new byte[dataSize2];
        QcRilHook qcRilHook = this.mQcRilHook;
        ByteBuffer reqBuffer = QcRilHook.createBufferWithNativeByteOrder(requestData);
        AdnOemHookCallback oemHookCb = new AdnOemHookCallback(callbackMsg, 1);
        reqBuffer.putShort((short) adnRecordInfo.getRecordIndex());
        if (!TextUtils.isEmpty(name)) {
            reqBuffer.putShort((short) name.getBytes().length);
            try {
                reqBuffer.put(name.getBytes("UTF-8"));
                reqBuffer.put((byte) 0);
            } catch (UnsupportedEncodingException e) {
                loge("Unsupport UTF-8 to parse name");
                return;
            }
        } else {
            reqBuffer.putShort(0);
        }
        if (!TextUtils.isEmpty(number)) {
            reqBuffer.putShort((short) number.getBytes().length);
            try {
                reqBuffer.put(QtiSimPhoneBookAdnRecord.ConvertToRecordNumber(number).getBytes("UTF-8"));
                reqBuffer.put((byte) 0);
            } catch (UnsupportedEncodingException e2) {
                loge("Unsupport UTF-8 to parse number");
                return;
            }
        } else {
            reqBuffer.putShort(0);
        }
        reqBuffer.putShort((short) numEmails);
        int i2 = 0;
        while (i2 < numEmails) {
            reqBuffer.putShort((short) adnRecordInfo.getEmails()[i2].getBytes().length);
            try {
                reqBuffer.put(adnRecordInfo.getEmails()[i2].getBytes("UTF-8"));
                reqBuffer.put((byte) 0);
                i2++;
            } catch (UnsupportedEncodingException e3) {
                loge("Unsupport UTF-8 to parse email");
                return;
            }
        }
        reqBuffer.putShort((short) numAdNumbers);
        int j2 = 0;
        while (j2 < numAdNumbers) {
            reqBuffer.putShort((short) adnRecordInfo.getAdNumbers()[j2].getBytes().length);
            try {
                reqBuffer.put(QtiSimPhoneBookAdnRecord.ConvertToRecordNumber(adnRecordInfo.getAdNumbers()[j2]).getBytes("UTF-8"));
                reqBuffer.put((byte) 0);
                j2++;
            } catch (UnsupportedEncodingException e4) {
                loge("Unsupport UTF-8 to parse anr");
                return;
            }
        }
        this.mQcRilHook.sendQcRilHookMsgAsync(IQcRilHook.QCRIL_EVT_HOOK_UPDATE_ADN_RECORD, requestData, oemHookCb, phoneId);
        logi("updateAdnRecord() with " + adnRecordInfo.toString());
    }

    public boolean isServiceReady() {
        return mIsServiceReady;
    }

    public void registerForUnsol(Handler handler, int event, Object obj) {
        QcRilHook qcRilHook = this.mQcRilHook;
        QcRilHook.register(handler, event, obj);
    }

    public void unRegisterForUnsol(Handler handler) {
        QcRilHook qcRilHook = this.mQcRilHook;
        QcRilHook.unregister(handler);
    }

    public void registerForServiceReadyEvent(Handler h, int what, Object obj) {
        Registrant r = new Registrant(h, what, obj);
        this.mServiceReadyRegistrantList.add(r);
        if (isServiceReady()) {
            r.notifyRegistrant(new AsyncResult((Object) null, Boolean.valueOf(mIsServiceReady), (Throwable) null));
        }
    }

    public void registerForAdnInitDone(Handler h, int what, Object obj) {
        this.mAdnInitDoneRegistrantList.add(new Registrant(h, what, obj));
    }

    public void registerForAdnRecordsInfo(Handler h, int what, Object obj) {
        this.mAdnRecordsInfoRegistrantList.add(new Registrant(h, what, obj));
    }

    public void qcRilSendDDSInfo(int ddsPhoneId, int reason, int rilId) {
        this.mQcRilHook.qcRilSendDDSInfo(ddsPhoneId, reason, rilId);
    }

    public void unRegisterForServiceReadyEvent(Handler h) {
        this.mServiceReadyRegistrantList.remove(h);
    }

    public void unregisterForAdnInitDone(Handler h) {
        this.mAdnInitDoneRegistrantList.remove(h);
    }

    public void unregisterForAdnRecordsInfo(Handler h) {
        this.mAdnRecordsInfoRegistrantList.remove(h);
    }

    public boolean setLocalCallHold(int phoneId, boolean enable) {
        return this.mQcRilHook.setLocalCallHold(phoneId, enable);
    }

    /* access modifiers changed from: private */
    public Object responseAdnRecords(byte[] data) {
        ByteBuffer byteBuf = ByteBuffer.wrap(data);
        byteBuf.order(ByteOrder.nativeOrder());
        int numRecords = byteBuf.getShort();
        QtiSimPhoneBookAdnRecord[] AdnRecordsInfoGroup = new QtiSimPhoneBookAdnRecord[numRecords];
        for (int i = 0; i < numRecords; i++) {
            AdnRecordsInfoGroup[i] = new QtiSimPhoneBookAdnRecord();
            AdnRecordsInfoGroup[i].mRecordIndex = byteBuf.getShort();
            int nameLength = byteBuf.getShort();
            if (nameLength > 0) {
                byte[] alphaTag = new byte[nameLength];
                byteBuf.get(alphaTag);
                try {
                    AdnRecordsInfoGroup[i].mAlphaTag = new String(alphaTag, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    loge("Unsupport UTF-8 to parse name");
                }
            }
            int numberLength = byteBuf.getShort();
            if (numberLength > 0) {
                byte[] number = new byte[numberLength];
                byteBuf.get(number);
                try {
                    AdnRecordsInfoGroup[i].mNumber = QtiSimPhoneBookAdnRecord.ConvertToPhoneNumber(new String(number, "UTF-8"));
                } catch (UnsupportedEncodingException e2) {
                    loge("Unsupport UTF-8 to parse number");
                }
            }
            int numEmails = byteBuf.getShort();
            if (numEmails > 0) {
                AdnRecordsInfoGroup[i].mEmailCount = numEmails;
                AdnRecordsInfoGroup[i].mEmails = new String[numEmails];
                for (int j = 0; j < numEmails; j++) {
                    int emailLength = byteBuf.getShort();
                    if (emailLength > 0) {
                        byte[] email = new byte[emailLength];
                        byteBuf.get(email);
                        try {
                            AdnRecordsInfoGroup[i].mEmails[j] = new String(email, "UTF-8");
                        } catch (UnsupportedEncodingException e3) {
                            loge("Unsupport UTF-8 to parse email");
                        }
                    }
                }
            }
            int numAnrs = byteBuf.getShort();
            if (numAnrs > 0) {
                AdnRecordsInfoGroup[i].mAdNumCount = numAnrs;
                AdnRecordsInfoGroup[i].mAdNumbers = new String[numAnrs];
                for (int k = 0; k < numAnrs; k++) {
                    int anrLength = byteBuf.getShort();
                    if (anrLength > 0) {
                        byte[] anr = new byte[anrLength];
                        byteBuf.get(anr);
                        try {
                            AdnRecordsInfoGroup[i].mAdNumbers[k] = QtiSimPhoneBookAdnRecord.ConvertToPhoneNumber(new String(anr, "UTF-8"));
                        } catch (UnsupportedEncodingException e4) {
                            loge("Unsupport UTF-8 to parse anr");
                        }
                    }
                }
            }
        }
        logd(Arrays.toString(AdnRecordsInfoGroup));
        return AdnRecordsInfoGroup;
    }

    /* access modifiers changed from: private */
    public void logd(String string) {
        Rlog.d(LOG_TAG, string);
    }

    private void logi(String string) {
        Rlog.i(LOG_TAG, string);
    }

    private void loge(String string) {
        Rlog.e(LOG_TAG, string);
    }
}
