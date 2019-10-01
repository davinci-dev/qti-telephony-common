package android.hardware.radio.V1_0;

import android.hidl.base.V1_0.DebugInfo;
import android.hidl.base.V1_0.IBase;
import android.os.HidlSupport;
import android.os.HwBinder;
import android.os.HwBlob;
import android.os.HwParcel;
import android.os.IHwBinder;
import android.os.IHwBinder.DeathRecipient;
import android.os.IHwInterface;
import android.os.NativeHandle;
import android.os.RemoteException;
import com.qualcomm.qti.internal.telephony.primarycard.SubsidyLockSettingsObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public interface IRadioResponse extends IBase {
    public static final String kInterfaceName = "android.hardware.radio@1.0::IRadioResponse";

    public static final class Proxy implements IRadioResponse {
        private IHwBinder mRemote;

        public Proxy(IHwBinder remote) {
            this.mRemote = (IHwBinder) Objects.requireNonNull(remote);
        }

        public IHwBinder asBinder() {
            return this.mRemote;
        }

        public String toString() {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(interfaceDescriptor());
                sb.append("@Proxy");
                return sb.toString();
            } catch (RemoteException e) {
                return "[class or subclass of android.hardware.radio@1.0::IRadioResponse]@Proxy";
            }
        }

        public final boolean equals(Object other) {
            return HidlSupport.interfacesEqual(this, other);
        }

        public final int hashCode() {
            return asBinder().hashCode();
        }

        public void getIccCardStatusResponse(RadioResponseInfo info, CardStatus cardStatus) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            cardStatus.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(1, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void supplyIccPinForAppResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(2, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void supplyIccPukForAppResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(3, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void supplyIccPin2ForAppResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(4, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void supplyIccPuk2ForAppResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(5, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void changeIccPinForAppResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(6, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void changeIccPin2ForAppResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(7, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void supplyNetworkDepersonalizationResponse(RadioResponseInfo info, int remainingRetries) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(remainingRetries);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(8, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCurrentCallsResponse(RadioResponseInfo info, ArrayList<Call> calls) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            Call.writeVectorToParcel(_hidl_request, calls);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(9, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void dialResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(10, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getIMSIForAppResponse(RadioResponseInfo info, String imsi) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(imsi);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(11, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void hangupConnectionResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(12, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void hangupWaitingOrBackgroundResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(13, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void hangupForegroundResumeBackgroundResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(14, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void switchWaitingOrHoldingAndActiveResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(15, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void conferenceResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(16, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void rejectCallResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(17, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getLastCallFailCauseResponse(RadioResponseInfo info, LastCallFailCauseInfo failCauseinfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            failCauseinfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(18, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getSignalStrengthResponse(RadioResponseInfo info, SignalStrength sigStrength) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sigStrength.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(19, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getVoiceRegistrationStateResponse(RadioResponseInfo info, VoiceRegStateResult voiceRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            voiceRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(20, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getDataRegistrationStateResponse(RadioResponseInfo info, DataRegStateResult dataRegResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dataRegResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(21, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getOperatorResponse(RadioResponseInfo info, String longName, String shortName, String numeric) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(longName);
            _hidl_request.writeString(shortName);
            _hidl_request.writeString(numeric);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(22, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setRadioPowerResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(23, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendDtmfResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(24, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendSmsResponse(RadioResponseInfo info, SendSmsResult sms) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sms.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(25, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendSMSExpectMoreResponse(RadioResponseInfo info, SendSmsResult sms) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sms.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(26, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setupDataCallResponse(RadioResponseInfo info, SetupDataCallResult dcResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            dcResponse.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(27, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void iccIOForAppResponse(RadioResponseInfo info, IccIoResult iccIo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            iccIo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(28, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendUssdResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(29, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void cancelPendingUssdResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(30, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getClirResponse(RadioResponseInfo info, int n, int m) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(n);
            _hidl_request.writeInt32(m);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(31, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setClirResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(32, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCallForwardStatusResponse(RadioResponseInfo info, ArrayList<CallForwardInfo> callForwardInfos) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            CallForwardInfo.writeVectorToParcel(_hidl_request, callForwardInfos);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(33, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCallForwardResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(34, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCallWaitingResponse(RadioResponseInfo info, boolean enable, int serviceClass) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeBool(enable);
            _hidl_request.writeInt32(serviceClass);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(35, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCallWaitingResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(36, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void acknowledgeLastIncomingGsmSmsResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(37, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void acceptCallResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(38, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void deactivateDataCallResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(39, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getFacilityLockForAppResponse(RadioResponseInfo info, int response) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(response);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(40, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setFacilityLockForAppResponse(RadioResponseInfo info, int retry) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(retry);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(41, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setBarringPasswordResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(42, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getNetworkSelectionModeResponse(RadioResponseInfo info, boolean manual) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeBool(manual);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(43, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setNetworkSelectionModeAutomaticResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(44, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setNetworkSelectionModeManualResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(45, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getAvailableNetworksResponse(RadioResponseInfo info, ArrayList<OperatorInfo> networkInfos) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            OperatorInfo.writeVectorToParcel(_hidl_request, networkInfos);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(46, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void startDtmfResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(47, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void stopDtmfResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(48, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getBasebandVersionResponse(RadioResponseInfo info, String version) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(version);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(49, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void separateConnectionResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(50, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setMuteResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(51, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getMuteResponse(RadioResponseInfo info, boolean enable) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeBool(enable);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(52, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getClipResponse(RadioResponseInfo info, int status) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(status);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(53, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getDataCallListResponse(RadioResponseInfo info, ArrayList<SetupDataCallResult> dcResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            SetupDataCallResult.writeVectorToParcel(_hidl_request, dcResponse);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(54, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setSuppServiceNotificationsResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(55, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void writeSmsToSimResponse(RadioResponseInfo info, int index) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(index);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(56, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void deleteSmsOnSimResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(57, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setBandModeResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(58, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getAvailableBandModesResponse(RadioResponseInfo info, ArrayList<Integer> bandModes) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32Vector(bandModes);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(59, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendEnvelopeResponse(RadioResponseInfo info, String commandResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(commandResponse);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(60, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendTerminalResponseToSimResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(61, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void handleStkCallSetupRequestFromSimResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(62, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void explicitCallTransferResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(63, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setPreferredNetworkTypeResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(64, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getPreferredNetworkTypeResponse(RadioResponseInfo info, int nwType) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(nwType);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(65, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getNeighboringCidsResponse(RadioResponseInfo info, ArrayList<NeighboringCell> cells) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            NeighboringCell.writeVectorToParcel(_hidl_request, cells);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(66, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setLocationUpdatesResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(67, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCdmaSubscriptionSourceResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(68, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCdmaRoamingPreferenceResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(69, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCdmaRoamingPreferenceResponse(RadioResponseInfo info, int type) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(type);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(70, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setTTYModeResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(71, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getTTYModeResponse(RadioResponseInfo info, int mode) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(mode);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(72, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setPreferredVoicePrivacyResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(73, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getPreferredVoicePrivacyResponse(RadioResponseInfo info, boolean enable) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeBool(enable);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(74, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendCDMAFeatureCodeResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(75, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendBurstDtmfResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(76, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendCdmaSmsResponse(RadioResponseInfo info, SendSmsResult sms) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sms.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(77, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void acknowledgeLastIncomingCdmaSmsResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(78, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getGsmBroadcastConfigResponse(RadioResponseInfo info, ArrayList<GsmBroadcastSmsConfigInfo> configs) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            GsmBroadcastSmsConfigInfo.writeVectorToParcel(_hidl_request, configs);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(79, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setGsmBroadcastConfigResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(80, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setGsmBroadcastActivationResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(81, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCdmaBroadcastConfigResponse(RadioResponseInfo info, ArrayList<CdmaBroadcastSmsConfigInfo> configs) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            CdmaBroadcastSmsConfigInfo.writeVectorToParcel(_hidl_request, configs);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(82, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCdmaBroadcastConfigResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(83, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCdmaBroadcastActivationResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(84, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCDMASubscriptionResponse(RadioResponseInfo info, String mdn, String hSid, String hNid, String min, String prl) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(mdn);
            _hidl_request.writeString(hSid);
            _hidl_request.writeString(hNid);
            _hidl_request.writeString(min);
            _hidl_request.writeString(prl);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(85, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void writeSmsToRuimResponse(RadioResponseInfo info, int index) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(index);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(86, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void deleteSmsOnRuimResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(87, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getDeviceIdentityResponse(RadioResponseInfo info, String imei, String imeisv, String esn, String meid) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(imei);
            _hidl_request.writeString(imeisv);
            _hidl_request.writeString(esn);
            _hidl_request.writeString(meid);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(88, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void exitEmergencyCallbackModeResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(89, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getSmscAddressResponse(RadioResponseInfo info, String smsc) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(smsc);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(90, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setSmscAddressResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(91, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void reportSmsMemoryStatusResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(92, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void reportStkServiceIsRunningResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(93, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCdmaSubscriptionSourceResponse(RadioResponseInfo info, int source) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(source);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(94, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void requestIsimAuthenticationResponse(RadioResponseInfo info, String response) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(response);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(95, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void acknowledgeIncomingGsmSmsWithPduResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(96, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendEnvelopeWithStatusResponse(RadioResponseInfo info, IccIoResult iccIo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            iccIo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(97, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getVoiceRadioTechnologyResponse(RadioResponseInfo info, int rat) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(rat);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(98, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCellInfoListResponse(RadioResponseInfo info, ArrayList<CellInfo> cellInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            CellInfo.writeVectorToParcel(_hidl_request, cellInfo);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(99, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setCellInfoListRateResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(100, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setInitialAttachApnResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(101, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getImsRegistrationStateResponse(RadioResponseInfo info, boolean isRegistered, int ratFamily) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeBool(isRegistered);
            _hidl_request.writeInt32(ratFamily);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(102, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendImsSmsResponse(RadioResponseInfo info, SendSmsResult sms) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            sms.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(SubsidyLockSettingsObserver.SUBSIDY_UNLOCKED, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void iccTransmitApduBasicChannelResponse(RadioResponseInfo info, IccIoResult result) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            result.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(104, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void iccOpenLogicalChannelResponse(RadioResponseInfo info, int channelId, ArrayList<Byte> selectResponse) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(channelId);
            _hidl_request.writeInt8Vector(selectResponse);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(105, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void iccCloseLogicalChannelResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(106, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void iccTransmitApduLogicalChannelResponse(RadioResponseInfo info, IccIoResult result) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            result.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(107, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void nvReadItemResponse(RadioResponseInfo info, String result) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeString(result);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(108, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void nvWriteItemResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(109, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void nvWriteCdmaPrlResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(110, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void nvResetConfigResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(111, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setUiccSubscriptionResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.APN_TYPE_CONFLICT, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setDataAllowedResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.INVALID_PCSCF_ADDR, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getHardwareConfigResponse(RadioResponseInfo info, ArrayList<HardwareConfig> config) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HardwareConfig.writeVectorToParcel(_hidl_request, config);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void requestIccSimAuthenticationResponse(RadioResponseInfo info, IccIoResult result) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            result.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.EMM_ACCESS_BARRED, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setDataProfileResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.EMERGENCY_IFACE_ONLY, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void requestShutdownResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.IFACE_MISMATCH, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getRadioCapabilityResponse(RadioResponseInfo info, RadioCapability rc) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            rc.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.COMPANION_IFACE_IN_USE, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setRadioCapabilityResponse(RadioResponseInfo info, RadioCapability rc) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            rc.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.IP_ADDRESS_MISMATCH, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void startLceServiceResponse(RadioResponseInfo info, LceStatusInfo statusInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            statusInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.IFACE_AND_POL_FAMILY_MISMATCH, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void stopLceServiceResponse(RadioResponseInfo info, LceStatusInfo statusInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            statusInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.EMM_ACCESS_BARRED_INFINITE_RETRY, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void pullLceDataResponse(RadioResponseInfo info, LceDataInfo lceInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            lceInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(DataCallFailCause.AUTH_FAILURE_ON_EMERGENCY_CALL, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getModemActivityInfoResponse(RadioResponseInfo info, ActivityStatsInfo activityInfo) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            activityInfo.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(123, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setAllowedCarriersResponse(RadioResponseInfo info, int numAllowed) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeInt32(numAllowed);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(124, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void getAllowedCarriersResponse(RadioResponseInfo info, boolean allAllowed, CarrierRestrictions carriers) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            _hidl_request.writeBool(allAllowed);
            carriers.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(125, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void sendDeviceStateResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(126, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setIndicationFilterResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(LastCallFailCause.INTERWORKING_UNSPECIFIED, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void setSimCardPowerResponse(RadioResponseInfo info) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            info.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(128, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void acknowledgeRequest(int serial) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IRadioResponse.kInterfaceName);
            _hidl_request.writeInt32(serial);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(129, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<String> interfaceChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256067662, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                return _hidl_reply.readStringVector();
            } finally {
                _hidl_reply.release();
            }
        }

        public void debug(NativeHandle fd, ArrayList<String> options) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            _hidl_request.writeNativeHandle(fd);
            _hidl_request.writeStringVector(options);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256131655, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public String interfaceDescriptor() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256136003, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                return _hidl_reply.readString();
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<byte[]> getHashChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256398152, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList arrayList = new ArrayList();
                HwBlob _hidl_blob = _hidl_reply.readBuffer(16);
                int _hidl_vec_size = _hidl_blob.getInt32(8);
                HwBlob childBlob = _hidl_reply.readEmbeddedBuffer((long) (_hidl_vec_size * 32), _hidl_blob.handle(), 0, true);
                arrayList.clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                    byte[] _hidl_vec_element = new byte[32];
                    childBlob.copyToInt8Array((long) (_hidl_index_0 * 32), _hidl_vec_element, 32);
                    arrayList.add(_hidl_vec_element);
                }
                return arrayList;
            } finally {
                _hidl_reply.release();
            }
        }

        public void setHALInstrumentation() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256462420, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean linkToDeath(DeathRecipient recipient, long cookie) throws RemoteException {
            return this.mRemote.linkToDeath(recipient, cookie);
        }

        public void ping() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256921159, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public DebugInfo getDebugInfo() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257049926, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                DebugInfo _hidl_out_info = new DebugInfo();
                _hidl_out_info.readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        public void notifySyspropsChanged() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257120595, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean unlinkToDeath(DeathRecipient recipient) throws RemoteException {
            return this.mRemote.unlinkToDeath(recipient);
        }
    }

    public static abstract class Stub extends HwBinder implements IRadioResponse {
        public IHwBinder asBinder() {
            return this;
        }

        public final ArrayList<String> interfaceChain() {
            return new ArrayList<>(Arrays.asList(new String[]{IRadioResponse.kInterfaceName, IBase.kInterfaceName}));
        }

        public void debug(NativeHandle fd, ArrayList<String> arrayList) {
        }

        public final String interfaceDescriptor() {
            return IRadioResponse.kInterfaceName;
        }

        public final ArrayList<byte[]> getHashChain() {
            return new ArrayList<>(Arrays.asList(new byte[][]{new byte[]{29, 74, 87, 118, 97, 76, 8, -75, -41, -108, -91, -20, 90, -80, 70, -105, 38, 12, -67, 75, 52, 65, -43, -109, 92, -43, 62, -25, 29, 25, -38, 2}, new byte[]{-20, Byte.MAX_VALUE, -41, -98, -48, 45, -6, -123, -68, 73, -108, 38, -83, -82, 62, -66, 35, -17, 5, 36, -13, -51, 105, 87, 19, -109, 36, -72, 59, 24, -54, 76}}));
        }

        public final void setHALInstrumentation() {
        }

        public final boolean linkToDeath(DeathRecipient recipient, long cookie) {
            return true;
        }

        public final void ping() {
        }

        public final DebugInfo getDebugInfo() {
            DebugInfo info = new DebugInfo();
            info.pid = HidlSupport.getPidIfSharable();
            info.ptr = 0;
            info.arch = 0;
            return info;
        }

        public final void notifySyspropsChanged() {
            HwBinder.enableInstrumentation();
        }

        public final boolean unlinkToDeath(DeathRecipient recipient) {
            return true;
        }

        public IHwInterface queryLocalInterface(String descriptor) {
            if (IRadioResponse.kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws RemoteException {
            registerService(serviceName);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(interfaceDescriptor());
            sb.append("@Stub");
            return sb.toString();
        }

        public void onTransact(int _hidl_code, HwParcel _hidl_request, HwParcel _hidl_reply, int _hidl_flags) throws RemoteException {
            HwParcel hwParcel = _hidl_request;
            HwParcel hwParcel2 = _hidl_reply;
            String str = IRadioResponse.kInterfaceName;
            Object obj = 0;
            boolean _hidl_is_oneway = true;
            switch (_hidl_code) {
                case 1:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info = new RadioResponseInfo();
                    info.readFromParcel(hwParcel);
                    CardStatus cardStatus = new CardStatus();
                    cardStatus.readFromParcel(hwParcel);
                    getIccCardStatusResponse(info, cardStatus);
                    return;
                case 2:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info2 = new RadioResponseInfo();
                    info2.readFromParcel(hwParcel);
                    supplyIccPinForAppResponse(info2, _hidl_request.readInt32());
                    return;
                case 3:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info3 = new RadioResponseInfo();
                    info3.readFromParcel(hwParcel);
                    supplyIccPukForAppResponse(info3, _hidl_request.readInt32());
                    return;
                case 4:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info4 = new RadioResponseInfo();
                    info4.readFromParcel(hwParcel);
                    supplyIccPin2ForAppResponse(info4, _hidl_request.readInt32());
                    return;
                case 5:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info5 = new RadioResponseInfo();
                    info5.readFromParcel(hwParcel);
                    supplyIccPuk2ForAppResponse(info5, _hidl_request.readInt32());
                    return;
                case 6:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info6 = new RadioResponseInfo();
                    info6.readFromParcel(hwParcel);
                    changeIccPinForAppResponse(info6, _hidl_request.readInt32());
                    return;
                case 7:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info7 = new RadioResponseInfo();
                    info7.readFromParcel(hwParcel);
                    changeIccPin2ForAppResponse(info7, _hidl_request.readInt32());
                    return;
                case 8:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info8 = new RadioResponseInfo();
                    info8.readFromParcel(hwParcel);
                    supplyNetworkDepersonalizationResponse(info8, _hidl_request.readInt32());
                    return;
                case 9:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info9 = new RadioResponseInfo();
                    info9.readFromParcel(hwParcel);
                    getCurrentCallsResponse(info9, Call.readVectorFromParcel(_hidl_request));
                    return;
                case 10:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info10 = new RadioResponseInfo();
                    info10.readFromParcel(hwParcel);
                    dialResponse(info10);
                    return;
                case 11:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info11 = new RadioResponseInfo();
                    info11.readFromParcel(hwParcel);
                    getIMSIForAppResponse(info11, _hidl_request.readString());
                    return;
                case 12:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info12 = new RadioResponseInfo();
                    info12.readFromParcel(hwParcel);
                    hangupConnectionResponse(info12);
                    return;
                case 13:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info13 = new RadioResponseInfo();
                    info13.readFromParcel(hwParcel);
                    hangupWaitingOrBackgroundResponse(info13);
                    return;
                case 14:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info14 = new RadioResponseInfo();
                    info14.readFromParcel(hwParcel);
                    hangupForegroundResumeBackgroundResponse(info14);
                    return;
                case 15:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info15 = new RadioResponseInfo();
                    info15.readFromParcel(hwParcel);
                    switchWaitingOrHoldingAndActiveResponse(info15);
                    return;
                case 16:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info16 = new RadioResponseInfo();
                    info16.readFromParcel(hwParcel);
                    conferenceResponse(info16);
                    return;
                case 17:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info17 = new RadioResponseInfo();
                    info17.readFromParcel(hwParcel);
                    rejectCallResponse(info17);
                    return;
                case 18:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info18 = new RadioResponseInfo();
                    info18.readFromParcel(hwParcel);
                    LastCallFailCauseInfo failCauseinfo = new LastCallFailCauseInfo();
                    failCauseinfo.readFromParcel(hwParcel);
                    getLastCallFailCauseResponse(info18, failCauseinfo);
                    return;
                case 19:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info19 = new RadioResponseInfo();
                    info19.readFromParcel(hwParcel);
                    SignalStrength sigStrength = new SignalStrength();
                    sigStrength.readFromParcel(hwParcel);
                    getSignalStrengthResponse(info19, sigStrength);
                    return;
                case 20:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info20 = new RadioResponseInfo();
                    info20.readFromParcel(hwParcel);
                    VoiceRegStateResult voiceRegResponse = new VoiceRegStateResult();
                    voiceRegResponse.readFromParcel(hwParcel);
                    getVoiceRegistrationStateResponse(info20, voiceRegResponse);
                    return;
                case 21:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info21 = new RadioResponseInfo();
                    info21.readFromParcel(hwParcel);
                    DataRegStateResult dataRegResponse = new DataRegStateResult();
                    dataRegResponse.readFromParcel(hwParcel);
                    getDataRegistrationStateResponse(info21, dataRegResponse);
                    return;
                case 22:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info22 = new RadioResponseInfo();
                    info22.readFromParcel(hwParcel);
                    getOperatorResponse(info22, _hidl_request.readString(), _hidl_request.readString(), _hidl_request.readString());
                    return;
                case 23:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info23 = new RadioResponseInfo();
                    info23.readFromParcel(hwParcel);
                    setRadioPowerResponse(info23);
                    return;
                case 24:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info24 = new RadioResponseInfo();
                    info24.readFromParcel(hwParcel);
                    sendDtmfResponse(info24);
                    return;
                case 25:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info25 = new RadioResponseInfo();
                    info25.readFromParcel(hwParcel);
                    SendSmsResult sms = new SendSmsResult();
                    sms.readFromParcel(hwParcel);
                    sendSmsResponse(info25, sms);
                    return;
                case 26:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info26 = new RadioResponseInfo();
                    info26.readFromParcel(hwParcel);
                    SendSmsResult sms2 = new SendSmsResult();
                    sms2.readFromParcel(hwParcel);
                    sendSMSExpectMoreResponse(info26, sms2);
                    return;
                case 27:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info27 = new RadioResponseInfo();
                    info27.readFromParcel(hwParcel);
                    SetupDataCallResult dcResponse = new SetupDataCallResult();
                    dcResponse.readFromParcel(hwParcel);
                    setupDataCallResponse(info27, dcResponse);
                    return;
                case 28:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info28 = new RadioResponseInfo();
                    info28.readFromParcel(hwParcel);
                    IccIoResult iccIo = new IccIoResult();
                    iccIo.readFromParcel(hwParcel);
                    iccIOForAppResponse(info28, iccIo);
                    return;
                case 29:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info29 = new RadioResponseInfo();
                    info29.readFromParcel(hwParcel);
                    sendUssdResponse(info29);
                    return;
                case 30:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info30 = new RadioResponseInfo();
                    info30.readFromParcel(hwParcel);
                    cancelPendingUssdResponse(info30);
                    return;
                case 31:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info31 = new RadioResponseInfo();
                    info31.readFromParcel(hwParcel);
                    getClirResponse(info31, _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case 32:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info32 = new RadioResponseInfo();
                    info32.readFromParcel(hwParcel);
                    setClirResponse(info32);
                    return;
                case 33:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info33 = new RadioResponseInfo();
                    info33.readFromParcel(hwParcel);
                    getCallForwardStatusResponse(info33, CallForwardInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 34:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info34 = new RadioResponseInfo();
                    info34.readFromParcel(hwParcel);
                    setCallForwardResponse(info34);
                    return;
                case 35:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info35 = new RadioResponseInfo();
                    info35.readFromParcel(hwParcel);
                    getCallWaitingResponse(info35, _hidl_request.readBool(), _hidl_request.readInt32());
                    return;
                case 36:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info36 = new RadioResponseInfo();
                    info36.readFromParcel(hwParcel);
                    setCallWaitingResponse(info36);
                    return;
                case 37:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info37 = new RadioResponseInfo();
                    info37.readFromParcel(hwParcel);
                    acknowledgeLastIncomingGsmSmsResponse(info37);
                    return;
                case 38:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info38 = new RadioResponseInfo();
                    info38.readFromParcel(hwParcel);
                    acceptCallResponse(info38);
                    return;
                case 39:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info39 = new RadioResponseInfo();
                    info39.readFromParcel(hwParcel);
                    deactivateDataCallResponse(info39);
                    return;
                case 40:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info40 = new RadioResponseInfo();
                    info40.readFromParcel(hwParcel);
                    getFacilityLockForAppResponse(info40, _hidl_request.readInt32());
                    return;
                case 41:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info41 = new RadioResponseInfo();
                    info41.readFromParcel(hwParcel);
                    setFacilityLockForAppResponse(info41, _hidl_request.readInt32());
                    return;
                case 42:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info42 = new RadioResponseInfo();
                    info42.readFromParcel(hwParcel);
                    setBarringPasswordResponse(info42);
                    return;
                case 43:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info43 = new RadioResponseInfo();
                    info43.readFromParcel(hwParcel);
                    getNetworkSelectionModeResponse(info43, _hidl_request.readBool());
                    return;
                case 44:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info44 = new RadioResponseInfo();
                    info44.readFromParcel(hwParcel);
                    setNetworkSelectionModeAutomaticResponse(info44);
                    return;
                case 45:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info45 = new RadioResponseInfo();
                    info45.readFromParcel(hwParcel);
                    setNetworkSelectionModeManualResponse(info45);
                    return;
                case 46:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info46 = new RadioResponseInfo();
                    info46.readFromParcel(hwParcel);
                    getAvailableNetworksResponse(info46, OperatorInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 47:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info47 = new RadioResponseInfo();
                    info47.readFromParcel(hwParcel);
                    startDtmfResponse(info47);
                    return;
                case RadioError.NO_SMS_TO_ACK /*48*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info48 = new RadioResponseInfo();
                    info48.readFromParcel(hwParcel);
                    stopDtmfResponse(info48);
                    return;
                case 49:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info49 = new RadioResponseInfo();
                    info49.readFromParcel(hwParcel);
                    getBasebandVersionResponse(info49, _hidl_request.readString());
                    return;
                case 50:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info50 = new RadioResponseInfo();
                    info50.readFromParcel(hwParcel);
                    separateConnectionResponse(info50);
                    return;
                case 51:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info51 = new RadioResponseInfo();
                    info51.readFromParcel(hwParcel);
                    setMuteResponse(info51);
                    return;
                case 52:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info52 = new RadioResponseInfo();
                    info52.readFromParcel(hwParcel);
                    getMuteResponse(info52, _hidl_request.readBool());
                    return;
                case 53:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info53 = new RadioResponseInfo();
                    info53.readFromParcel(hwParcel);
                    getClipResponse(info53, _hidl_request.readInt32());
                    return;
                case 54:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info54 = new RadioResponseInfo();
                    info54.readFromParcel(hwParcel);
                    getDataCallListResponse(info54, SetupDataCallResult.readVectorFromParcel(_hidl_request));
                    return;
                case 55:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info55 = new RadioResponseInfo();
                    info55.readFromParcel(hwParcel);
                    setSuppServiceNotificationsResponse(info55);
                    return;
                case 56:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info56 = new RadioResponseInfo();
                    info56.readFromParcel(hwParcel);
                    writeSmsToSimResponse(info56, _hidl_request.readInt32());
                    return;
                case 57:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info57 = new RadioResponseInfo();
                    info57.readFromParcel(hwParcel);
                    deleteSmsOnSimResponse(info57);
                    return;
                case 58:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info58 = new RadioResponseInfo();
                    info58.readFromParcel(hwParcel);
                    setBandModeResponse(info58);
                    return;
                case 59:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info59 = new RadioResponseInfo();
                    info59.readFromParcel(hwParcel);
                    getAvailableBandModesResponse(info59, _hidl_request.readInt32Vector());
                    return;
                case RadioError.NETWORK_NOT_READY /*60*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info60 = new RadioResponseInfo();
                    info60.readFromParcel(hwParcel);
                    sendEnvelopeResponse(info60, _hidl_request.readString());
                    return;
                case RadioError.NOT_PROVISIONED /*61*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info61 = new RadioResponseInfo();
                    info61.readFromParcel(hwParcel);
                    sendTerminalResponseToSimResponse(info61);
                    return;
                case RadioError.NO_SUBSCRIPTION /*62*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info62 = new RadioResponseInfo();
                    info62.readFromParcel(hwParcel);
                    handleStkCallSetupRequestFromSimResponse(info62);
                    return;
                case 63:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info63 = new RadioResponseInfo();
                    info63.readFromParcel(hwParcel);
                    explicitCallTransferResponse(info63);
                    return;
                case 64:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info64 = new RadioResponseInfo();
                    info64.readFromParcel(hwParcel);
                    setPreferredNetworkTypeResponse(info64);
                    return;
                case 65:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info65 = new RadioResponseInfo();
                    info65.readFromParcel(hwParcel);
                    getPreferredNetworkTypeResponse(info65, _hidl_request.readInt32());
                    return;
                case 66:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info66 = new RadioResponseInfo();
                    info66.readFromParcel(hwParcel);
                    getNeighboringCidsResponse(info66, NeighboringCell.readVectorFromParcel(_hidl_request));
                    return;
                case 67:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info67 = new RadioResponseInfo();
                    info67.readFromParcel(hwParcel);
                    setLocationUpdatesResponse(info67);
                    return;
                case LastCallFailCause.ACM_LIMIT_EXCEEDED /*68*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info68 = new RadioResponseInfo();
                    info68.readFromParcel(hwParcel);
                    setCdmaSubscriptionSourceResponse(info68);
                    return;
                case LastCallFailCause.REQUESTED_FACILITY_NOT_IMPLEMENTED /*69*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info69 = new RadioResponseInfo();
                    info69.readFromParcel(hwParcel);
                    setCdmaRoamingPreferenceResponse(info69);
                    return;
                case LastCallFailCause.ONLY_DIGITAL_INFORMATION_BEARER_AVAILABLE /*70*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info70 = new RadioResponseInfo();
                    info70.readFromParcel(hwParcel);
                    getCdmaRoamingPreferenceResponse(info70, _hidl_request.readInt32());
                    return;
                case NvItem.LTE_BAND_ENABLE_25 /*71*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info71 = new RadioResponseInfo();
                    info71.readFromParcel(hwParcel);
                    setTTYModeResponse(info71);
                    return;
                case NvItem.LTE_BAND_ENABLE_26 /*72*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info72 = new RadioResponseInfo();
                    info72.readFromParcel(hwParcel);
                    getTTYModeResponse(info72, _hidl_request.readInt32());
                    return;
                case NvItem.LTE_BAND_ENABLE_41 /*73*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info73 = new RadioResponseInfo();
                    info73.readFromParcel(hwParcel);
                    setPreferredVoicePrivacyResponse(info73);
                    return;
                case NvItem.LTE_SCAN_PRIORITY_25 /*74*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info74 = new RadioResponseInfo();
                    info74.readFromParcel(hwParcel);
                    getPreferredVoicePrivacyResponse(info74, _hidl_request.readBool());
                    return;
                case NvItem.LTE_SCAN_PRIORITY_26 /*75*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info75 = new RadioResponseInfo();
                    info75.readFromParcel(hwParcel);
                    sendCDMAFeatureCodeResponse(info75);
                    return;
                case NvItem.LTE_SCAN_PRIORITY_41 /*76*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info76 = new RadioResponseInfo();
                    info76.readFromParcel(hwParcel);
                    sendBurstDtmfResponse(info76);
                    return;
                case NvItem.LTE_HIDDEN_BAND_PRIORITY_25 /*77*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info77 = new RadioResponseInfo();
                    info77.readFromParcel(hwParcel);
                    SendSmsResult sms3 = new SendSmsResult();
                    sms3.readFromParcel(hwParcel);
                    sendCdmaSmsResponse(info77, sms3);
                    return;
                case NvItem.LTE_HIDDEN_BAND_PRIORITY_26 /*78*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info78 = new RadioResponseInfo();
                    info78.readFromParcel(hwParcel);
                    acknowledgeLastIncomingCdmaSmsResponse(info78);
                    return;
                case 79:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info79 = new RadioResponseInfo();
                    info79.readFromParcel(hwParcel);
                    getGsmBroadcastConfigResponse(info79, GsmBroadcastSmsConfigInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 80:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info80 = new RadioResponseInfo();
                    info80.readFromParcel(hwParcel);
                    setGsmBroadcastConfigResponse(info80);
                    return;
                case 81:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info81 = new RadioResponseInfo();
                    info81.readFromParcel(hwParcel);
                    setGsmBroadcastActivationResponse(info81);
                    return;
                case 82:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info82 = new RadioResponseInfo();
                    info82.readFromParcel(hwParcel);
                    getCdmaBroadcastConfigResponse(info82, CdmaBroadcastSmsConfigInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 83:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info83 = new RadioResponseInfo();
                    info83.readFromParcel(hwParcel);
                    setCdmaBroadcastConfigResponse(info83);
                    return;
                case 84:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info84 = new RadioResponseInfo();
                    info84.readFromParcel(hwParcel);
                    setCdmaBroadcastActivationResponse(info84);
                    return;
                case 85:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info85 = new RadioResponseInfo();
                    info85.readFromParcel(hwParcel);
                    getCDMASubscriptionResponse(info85, _hidl_request.readString(), _hidl_request.readString(), _hidl_request.readString(), _hidl_request.readString(), _hidl_request.readString());
                    return;
                case 86:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info86 = new RadioResponseInfo();
                    info86.readFromParcel(hwParcel);
                    writeSmsToRuimResponse(info86, _hidl_request.readInt32());
                    return;
                case LastCallFailCause.USER_NOT_MEMBER_OF_CUG /*87*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info87 = new RadioResponseInfo();
                    info87.readFromParcel(hwParcel);
                    deleteSmsOnRuimResponse(info87);
                    return;
                case LastCallFailCause.INCOMPATIBLE_DESTINATION /*88*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info88 = new RadioResponseInfo();
                    info88.readFromParcel(hwParcel);
                    getDeviceIdentityResponse(info88, _hidl_request.readString(), _hidl_request.readString(), _hidl_request.readString(), _hidl_request.readString());
                    return;
                case 89:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info89 = new RadioResponseInfo();
                    info89.readFromParcel(hwParcel);
                    exitEmergencyCallbackModeResponse(info89);
                    return;
                case 90:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info90 = new RadioResponseInfo();
                    info90.readFromParcel(hwParcel);
                    getSmscAddressResponse(info90, _hidl_request.readString());
                    return;
                case LastCallFailCause.INVALID_TRANSIT_NW_SELECTION /*91*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info91 = new RadioResponseInfo();
                    info91.readFromParcel(hwParcel);
                    setSmscAddressResponse(info91);
                    return;
                case 92:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info92 = new RadioResponseInfo();
                    info92.readFromParcel(hwParcel);
                    reportSmsMemoryStatusResponse(info92);
                    return;
                case 93:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info93 = new RadioResponseInfo();
                    info93.readFromParcel(hwParcel);
                    reportStkServiceIsRunningResponse(info93);
                    return;
                case 94:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info94 = new RadioResponseInfo();
                    info94.readFromParcel(hwParcel);
                    getCdmaSubscriptionSourceResponse(info94, _hidl_request.readInt32());
                    return;
                case 95:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info95 = new RadioResponseInfo();
                    info95.readFromParcel(hwParcel);
                    requestIsimAuthenticationResponse(info95, _hidl_request.readString());
                    return;
                case 96:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info96 = new RadioResponseInfo();
                    info96.readFromParcel(hwParcel);
                    acknowledgeIncomingGsmSmsWithPduResponse(info96);
                    return;
                case 97:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info97 = new RadioResponseInfo();
                    info97.readFromParcel(hwParcel);
                    IccIoResult iccIo2 = new IccIoResult();
                    iccIo2.readFromParcel(hwParcel);
                    sendEnvelopeWithStatusResponse(info97, iccIo2);
                    return;
                case 98:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info98 = new RadioResponseInfo();
                    info98.readFromParcel(hwParcel);
                    getVoiceRadioTechnologyResponse(info98, _hidl_request.readInt32());
                    return;
                case 99:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info99 = new RadioResponseInfo();
                    info99.readFromParcel(hwParcel);
                    getCellInfoListResponse(info99, CellInfo.readVectorFromParcel(_hidl_request));
                    return;
                case 100:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info100 = new RadioResponseInfo();
                    info100.readFromParcel(hwParcel);
                    setCellInfoListRateResponse(info100);
                    return;
                case 101:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info101 = new RadioResponseInfo();
                    info101.readFromParcel(hwParcel);
                    setInitialAttachApnResponse(info101);
                    return;
                case 102:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info102 = new RadioResponseInfo();
                    info102.readFromParcel(hwParcel);
                    getImsRegistrationStateResponse(info102, _hidl_request.readBool(), _hidl_request.readInt32());
                    return;
                case SubsidyLockSettingsObserver.SUBSIDY_UNLOCKED /*103*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info103 = new RadioResponseInfo();
                    info103.readFromParcel(hwParcel);
                    SendSmsResult sms4 = new SendSmsResult();
                    sms4.readFromParcel(hwParcel);
                    sendImsSmsResponse(info103, sms4);
                    return;
                case 104:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info104 = new RadioResponseInfo();
                    info104.readFromParcel(hwParcel);
                    IccIoResult result = new IccIoResult();
                    result.readFromParcel(hwParcel);
                    iccTransmitApduBasicChannelResponse(info104, result);
                    return;
                case 105:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info105 = new RadioResponseInfo();
                    info105.readFromParcel(hwParcel);
                    iccOpenLogicalChannelResponse(info105, _hidl_request.readInt32(), _hidl_request.readInt8Vector());
                    return;
                case 106:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info106 = new RadioResponseInfo();
                    info106.readFromParcel(hwParcel);
                    iccCloseLogicalChannelResponse(info106);
                    return;
                case 107:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info107 = new RadioResponseInfo();
                    info107.readFromParcel(hwParcel);
                    IccIoResult result2 = new IccIoResult();
                    result2.readFromParcel(hwParcel);
                    iccTransmitApduLogicalChannelResponse(info107, result2);
                    return;
                case 108:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info108 = new RadioResponseInfo();
                    info108.readFromParcel(hwParcel);
                    nvReadItemResponse(info108, _hidl_request.readString());
                    return;
                case 109:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info109 = new RadioResponseInfo();
                    info109.readFromParcel(hwParcel);
                    nvWriteItemResponse(info109);
                    return;
                case 110:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info110 = new RadioResponseInfo();
                    info110.readFromParcel(hwParcel);
                    nvWriteCdmaPrlResponse(info110);
                    return;
                case 111:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info111 = new RadioResponseInfo();
                    info111.readFromParcel(hwParcel);
                    nvResetConfigResponse(info111);
                    return;
                case DataCallFailCause.APN_TYPE_CONFLICT /*112*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info112 = new RadioResponseInfo();
                    info112.readFromParcel(hwParcel);
                    setUiccSubscriptionResponse(info112);
                    return;
                case DataCallFailCause.INVALID_PCSCF_ADDR /*113*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info113 = new RadioResponseInfo();
                    info113.readFromParcel(hwParcel);
                    setDataAllowedResponse(info113);
                    return;
                case DataCallFailCause.INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN /*114*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info114 = new RadioResponseInfo();
                    info114.readFromParcel(hwParcel);
                    getHardwareConfigResponse(info114, HardwareConfig.readVectorFromParcel(_hidl_request));
                    return;
                case DataCallFailCause.EMM_ACCESS_BARRED /*115*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info115 = new RadioResponseInfo();
                    info115.readFromParcel(hwParcel);
                    IccIoResult result3 = new IccIoResult();
                    result3.readFromParcel(hwParcel);
                    requestIccSimAuthenticationResponse(info115, result3);
                    return;
                case DataCallFailCause.EMERGENCY_IFACE_ONLY /*116*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info116 = new RadioResponseInfo();
                    info116.readFromParcel(hwParcel);
                    setDataProfileResponse(info116);
                    return;
                case DataCallFailCause.IFACE_MISMATCH /*117*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info117 = new RadioResponseInfo();
                    info117.readFromParcel(hwParcel);
                    requestShutdownResponse(info117);
                    return;
                case DataCallFailCause.COMPANION_IFACE_IN_USE /*118*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info118 = new RadioResponseInfo();
                    info118.readFromParcel(hwParcel);
                    RadioCapability rc = new RadioCapability();
                    rc.readFromParcel(hwParcel);
                    getRadioCapabilityResponse(info118, rc);
                    return;
                case DataCallFailCause.IP_ADDRESS_MISMATCH /*119*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info119 = new RadioResponseInfo();
                    info119.readFromParcel(hwParcel);
                    RadioCapability rc2 = new RadioCapability();
                    rc2.readFromParcel(hwParcel);
                    setRadioCapabilityResponse(info119, rc2);
                    return;
                case DataCallFailCause.IFACE_AND_POL_FAMILY_MISMATCH /*120*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info120 = new RadioResponseInfo();
                    info120.readFromParcel(hwParcel);
                    LceStatusInfo statusInfo = new LceStatusInfo();
                    statusInfo.readFromParcel(hwParcel);
                    startLceServiceResponse(info120, statusInfo);
                    return;
                case DataCallFailCause.EMM_ACCESS_BARRED_INFINITE_RETRY /*121*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info121 = new RadioResponseInfo();
                    info121.readFromParcel(hwParcel);
                    LceStatusInfo statusInfo2 = new LceStatusInfo();
                    statusInfo2.readFromParcel(hwParcel);
                    stopLceServiceResponse(info121, statusInfo2);
                    return;
                case DataCallFailCause.AUTH_FAILURE_ON_EMERGENCY_CALL /*122*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info122 = new RadioResponseInfo();
                    info122.readFromParcel(hwParcel);
                    LceDataInfo lceInfo = new LceDataInfo();
                    lceInfo.readFromParcel(hwParcel);
                    pullLceDataResponse(info122, lceInfo);
                    return;
                case 123:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info123 = new RadioResponseInfo();
                    info123.readFromParcel(hwParcel);
                    ActivityStatsInfo activityInfo = new ActivityStatsInfo();
                    activityInfo.readFromParcel(hwParcel);
                    getModemActivityInfoResponse(info123, activityInfo);
                    return;
                case 124:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info124 = new RadioResponseInfo();
                    info124.readFromParcel(hwParcel);
                    setAllowedCarriersResponse(info124, _hidl_request.readInt32());
                    return;
                case 125:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info125 = new RadioResponseInfo();
                    info125.readFromParcel(hwParcel);
                    boolean allAllowed = _hidl_request.readBool();
                    CarrierRestrictions carriers = new CarrierRestrictions();
                    carriers.readFromParcel(hwParcel);
                    getAllowedCarriersResponse(info125, allAllowed, carriers);
                    return;
                case 126:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info126 = new RadioResponseInfo();
                    info126.readFromParcel(hwParcel);
                    sendDeviceStateResponse(info126);
                    return;
                case LastCallFailCause.INTERWORKING_UNSPECIFIED /*127*/:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info127 = new RadioResponseInfo();
                    info127.readFromParcel(hwParcel);
                    setIndicationFilterResponse(info127);
                    return;
                case 128:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    RadioResponseInfo info128 = new RadioResponseInfo();
                    info128.readFromParcel(hwParcel);
                    setSimCardPowerResponse(info128);
                    return;
                case 129:
                    if ((_hidl_flags & 1) != 0) {
                        obj = 1;
                    }
                    if (obj != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(str);
                    acknowledgeRequest(_hidl_request.readInt32());
                    return;
                default:
                    String str2 = IBase.kInterfaceName;
                    switch (_hidl_code) {
                        case 256067662:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            ArrayList<String> _hidl_out_descriptors = interfaceChain();
                            hwParcel2.writeStatus(0);
                            hwParcel2.writeStringVector(_hidl_out_descriptors);
                            _hidl_reply.send();
                            return;
                        case 256131655:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            debug(_hidl_request.readNativeHandle(), _hidl_request.readStringVector());
                            hwParcel2.writeStatus(0);
                            _hidl_reply.send();
                            return;
                        case 256136003:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            String _hidl_out_descriptor = interfaceDescriptor();
                            hwParcel2.writeStatus(0);
                            hwParcel2.writeString(_hidl_out_descriptor);
                            _hidl_reply.send();
                            return;
                        case 256398152:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            ArrayList<byte[]> _hidl_out_hashchain = getHashChain();
                            hwParcel2.writeStatus(0);
                            HwBlob _hidl_blob = new HwBlob(16);
                            int _hidl_vec_size = _hidl_out_hashchain.size();
                            _hidl_blob.putInt32(8, _hidl_vec_size);
                            _hidl_blob.putBool(12, false);
                            HwBlob childBlob = new HwBlob(_hidl_vec_size * 32);
                            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                                long _hidl_array_offset_1 = (long) (_hidl_index_0 * 32);
                                byte[] _hidl_array_item_1 = (byte[]) _hidl_out_hashchain.get(_hidl_index_0);
                                if (_hidl_array_item_1 == null || _hidl_array_item_1.length != 32) {
                                    throw new IllegalArgumentException("Array element is not of the expected length");
                                }
                                childBlob.putInt8Array(_hidl_array_offset_1, _hidl_array_item_1);
                            }
                            _hidl_blob.putBlob(0, childBlob);
                            hwParcel2.writeBuffer(_hidl_blob);
                            _hidl_reply.send();
                            return;
                        case 256462420:
                            if ((_hidl_flags & 1) != 0) {
                                obj = 1;
                            }
                            if (obj != 1) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            setHALInstrumentation();
                            return;
                        case 256660548:
                            if ((_hidl_flags & 1) != 0) {
                                obj = 1;
                            }
                            if (obj != 0) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            return;
                        case 256921159:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            ping();
                            hwParcel2.writeStatus(0);
                            _hidl_reply.send();
                            return;
                        case 257049926:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            DebugInfo _hidl_out_info = getDebugInfo();
                            hwParcel2.writeStatus(0);
                            _hidl_out_info.writeToParcel(hwParcel2);
                            _hidl_reply.send();
                            return;
                        case 257120595:
                            if ((_hidl_flags & 1) != 0) {
                                obj = 1;
                            }
                            if (obj != 1) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(str2);
                            notifySyspropsChanged();
                            return;
                        case 257250372:
                            if ((_hidl_flags & 1) != 0) {
                                obj = 1;
                            }
                            if (obj != 0) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    void acceptCallResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void acknowledgeIncomingGsmSmsWithPduResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void acknowledgeLastIncomingCdmaSmsResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void acknowledgeLastIncomingGsmSmsResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void acknowledgeRequest(int i) throws RemoteException;

    IHwBinder asBinder();

    void cancelPendingUssdResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void changeIccPin2ForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void changeIccPinForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void conferenceResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void deactivateDataCallResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void debug(NativeHandle nativeHandle, ArrayList<String> arrayList) throws RemoteException;

    void deleteSmsOnRuimResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void deleteSmsOnSimResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void dialResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void exitEmergencyCallbackModeResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void explicitCallTransferResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void getAllowedCarriersResponse(RadioResponseInfo radioResponseInfo, boolean z, CarrierRestrictions carrierRestrictions) throws RemoteException;

    void getAvailableBandModesResponse(RadioResponseInfo radioResponseInfo, ArrayList<Integer> arrayList) throws RemoteException;

    void getAvailableNetworksResponse(RadioResponseInfo radioResponseInfo, ArrayList<OperatorInfo> arrayList) throws RemoteException;

    void getBasebandVersionResponse(RadioResponseInfo radioResponseInfo, String str) throws RemoteException;

    void getCDMASubscriptionResponse(RadioResponseInfo radioResponseInfo, String str, String str2, String str3, String str4, String str5) throws RemoteException;

    void getCallForwardStatusResponse(RadioResponseInfo radioResponseInfo, ArrayList<CallForwardInfo> arrayList) throws RemoteException;

    void getCallWaitingResponse(RadioResponseInfo radioResponseInfo, boolean z, int i) throws RemoteException;

    void getCdmaBroadcastConfigResponse(RadioResponseInfo radioResponseInfo, ArrayList<CdmaBroadcastSmsConfigInfo> arrayList) throws RemoteException;

    void getCdmaRoamingPreferenceResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getCdmaSubscriptionSourceResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getCellInfoListResponse(RadioResponseInfo radioResponseInfo, ArrayList<CellInfo> arrayList) throws RemoteException;

    void getClipResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getClirResponse(RadioResponseInfo radioResponseInfo, int i, int i2) throws RemoteException;

    void getCurrentCallsResponse(RadioResponseInfo radioResponseInfo, ArrayList<Call> arrayList) throws RemoteException;

    void getDataCallListResponse(RadioResponseInfo radioResponseInfo, ArrayList<SetupDataCallResult> arrayList) throws RemoteException;

    void getDataRegistrationStateResponse(RadioResponseInfo radioResponseInfo, DataRegStateResult dataRegStateResult) throws RemoteException;

    DebugInfo getDebugInfo() throws RemoteException;

    void getDeviceIdentityResponse(RadioResponseInfo radioResponseInfo, String str, String str2, String str3, String str4) throws RemoteException;

    void getFacilityLockForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getGsmBroadcastConfigResponse(RadioResponseInfo radioResponseInfo, ArrayList<GsmBroadcastSmsConfigInfo> arrayList) throws RemoteException;

    void getHardwareConfigResponse(RadioResponseInfo radioResponseInfo, ArrayList<HardwareConfig> arrayList) throws RemoteException;

    ArrayList<byte[]> getHashChain() throws RemoteException;

    void getIMSIForAppResponse(RadioResponseInfo radioResponseInfo, String str) throws RemoteException;

    void getIccCardStatusResponse(RadioResponseInfo radioResponseInfo, CardStatus cardStatus) throws RemoteException;

    void getImsRegistrationStateResponse(RadioResponseInfo radioResponseInfo, boolean z, int i) throws RemoteException;

    void getLastCallFailCauseResponse(RadioResponseInfo radioResponseInfo, LastCallFailCauseInfo lastCallFailCauseInfo) throws RemoteException;

    void getModemActivityInfoResponse(RadioResponseInfo radioResponseInfo, ActivityStatsInfo activityStatsInfo) throws RemoteException;

    void getMuteResponse(RadioResponseInfo radioResponseInfo, boolean z) throws RemoteException;

    void getNeighboringCidsResponse(RadioResponseInfo radioResponseInfo, ArrayList<NeighboringCell> arrayList) throws RemoteException;

    void getNetworkSelectionModeResponse(RadioResponseInfo radioResponseInfo, boolean z) throws RemoteException;

    void getOperatorResponse(RadioResponseInfo radioResponseInfo, String str, String str2, String str3) throws RemoteException;

    void getPreferredNetworkTypeResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getPreferredVoicePrivacyResponse(RadioResponseInfo radioResponseInfo, boolean z) throws RemoteException;

    void getRadioCapabilityResponse(RadioResponseInfo radioResponseInfo, RadioCapability radioCapability) throws RemoteException;

    void getSignalStrengthResponse(RadioResponseInfo radioResponseInfo, SignalStrength signalStrength) throws RemoteException;

    void getSmscAddressResponse(RadioResponseInfo radioResponseInfo, String str) throws RemoteException;

    void getTTYModeResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getVoiceRadioTechnologyResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void getVoiceRegistrationStateResponse(RadioResponseInfo radioResponseInfo, VoiceRegStateResult voiceRegStateResult) throws RemoteException;

    void handleStkCallSetupRequestFromSimResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void hangupConnectionResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void hangupForegroundResumeBackgroundResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void hangupWaitingOrBackgroundResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void iccCloseLogicalChannelResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void iccIOForAppResponse(RadioResponseInfo radioResponseInfo, IccIoResult iccIoResult) throws RemoteException;

    void iccOpenLogicalChannelResponse(RadioResponseInfo radioResponseInfo, int i, ArrayList<Byte> arrayList) throws RemoteException;

    void iccTransmitApduBasicChannelResponse(RadioResponseInfo radioResponseInfo, IccIoResult iccIoResult) throws RemoteException;

    void iccTransmitApduLogicalChannelResponse(RadioResponseInfo radioResponseInfo, IccIoResult iccIoResult) throws RemoteException;

    ArrayList<String> interfaceChain() throws RemoteException;

    String interfaceDescriptor() throws RemoteException;

    boolean linkToDeath(DeathRecipient deathRecipient, long j) throws RemoteException;

    void notifySyspropsChanged() throws RemoteException;

    void nvReadItemResponse(RadioResponseInfo radioResponseInfo, String str) throws RemoteException;

    void nvResetConfigResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void nvWriteCdmaPrlResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void nvWriteItemResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void ping() throws RemoteException;

    void pullLceDataResponse(RadioResponseInfo radioResponseInfo, LceDataInfo lceDataInfo) throws RemoteException;

    void rejectCallResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void reportSmsMemoryStatusResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void reportStkServiceIsRunningResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void requestIccSimAuthenticationResponse(RadioResponseInfo radioResponseInfo, IccIoResult iccIoResult) throws RemoteException;

    void requestIsimAuthenticationResponse(RadioResponseInfo radioResponseInfo, String str) throws RemoteException;

    void requestShutdownResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void sendBurstDtmfResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void sendCDMAFeatureCodeResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void sendCdmaSmsResponse(RadioResponseInfo radioResponseInfo, SendSmsResult sendSmsResult) throws RemoteException;

    void sendDeviceStateResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void sendDtmfResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void sendEnvelopeResponse(RadioResponseInfo radioResponseInfo, String str) throws RemoteException;

    void sendEnvelopeWithStatusResponse(RadioResponseInfo radioResponseInfo, IccIoResult iccIoResult) throws RemoteException;

    void sendImsSmsResponse(RadioResponseInfo radioResponseInfo, SendSmsResult sendSmsResult) throws RemoteException;

    void sendSMSExpectMoreResponse(RadioResponseInfo radioResponseInfo, SendSmsResult sendSmsResult) throws RemoteException;

    void sendSmsResponse(RadioResponseInfo radioResponseInfo, SendSmsResult sendSmsResult) throws RemoteException;

    void sendTerminalResponseToSimResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void sendUssdResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void separateConnectionResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setAllowedCarriersResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void setBandModeResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setBarringPasswordResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCallForwardResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCallWaitingResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCdmaBroadcastActivationResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCdmaBroadcastConfigResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCdmaRoamingPreferenceResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCdmaSubscriptionSourceResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setCellInfoListRateResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setClirResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setDataAllowedResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setDataProfileResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setFacilityLockForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void setGsmBroadcastActivationResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setGsmBroadcastConfigResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setHALInstrumentation() throws RemoteException;

    void setIndicationFilterResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setInitialAttachApnResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setLocationUpdatesResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setMuteResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setNetworkSelectionModeAutomaticResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setNetworkSelectionModeManualResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setPreferredNetworkTypeResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setPreferredVoicePrivacyResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setRadioCapabilityResponse(RadioResponseInfo radioResponseInfo, RadioCapability radioCapability) throws RemoteException;

    void setRadioPowerResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setSimCardPowerResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setSmscAddressResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setSuppServiceNotificationsResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setTTYModeResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setUiccSubscriptionResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void setupDataCallResponse(RadioResponseInfo radioResponseInfo, SetupDataCallResult setupDataCallResult) throws RemoteException;

    void startDtmfResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void startLceServiceResponse(RadioResponseInfo radioResponseInfo, LceStatusInfo lceStatusInfo) throws RemoteException;

    void stopDtmfResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    void stopLceServiceResponse(RadioResponseInfo radioResponseInfo, LceStatusInfo lceStatusInfo) throws RemoteException;

    void supplyIccPin2ForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void supplyIccPinForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void supplyIccPuk2ForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void supplyIccPukForAppResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void supplyNetworkDepersonalizationResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void switchWaitingOrHoldingAndActiveResponse(RadioResponseInfo radioResponseInfo) throws RemoteException;

    boolean unlinkToDeath(DeathRecipient deathRecipient) throws RemoteException;

    void writeSmsToRuimResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    void writeSmsToSimResponse(RadioResponseInfo radioResponseInfo, int i) throws RemoteException;

    static IRadioResponse asInterface(IHwBinder binder) {
        if (binder == null) {
            return null;
        }
        String str = kInterfaceName;
        IHwInterface iface = binder.queryLocalInterface(str);
        if (iface != null && (iface instanceof IRadioResponse)) {
            return (IRadioResponse) iface;
        }
        IRadioResponse proxy = new Proxy(binder);
        try {
            Iterator it = proxy.interfaceChain().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return proxy;
                }
            }
        } catch (RemoteException e) {
        }
        return null;
    }

    static IRadioResponse castFrom(IHwInterface iface) {
        if (iface == null) {
            return null;
        }
        return asInterface(iface.asBinder());
    }

    static IRadioResponse getService(String serviceName, boolean retry) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName, retry));
    }

    static IRadioResponse getService(boolean retry) throws RemoteException {
        return getService("default", retry);
    }

    static IRadioResponse getService(String serviceName) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName));
    }

    static IRadioResponse getService() throws RemoteException {
        return getService("default");
    }
}
