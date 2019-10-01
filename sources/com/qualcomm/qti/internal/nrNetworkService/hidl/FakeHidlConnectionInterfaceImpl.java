package com.qualcomm.qti.internal.nrNetworkService.hidl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import org.codeaurora.internal.BearerAllocationStatus;
import org.codeaurora.internal.DcParam;
import org.codeaurora.internal.NrConfigType;
import org.codeaurora.internal.NrIconType;
import org.codeaurora.internal.SignalStrength;
import org.codeaurora.internal.Status;
import org.codeaurora.internal.Token;
import org.codeaurora.internal.UpperLayerIndInfo;

public class FakeHidlConnectionInterfaceImpl implements IHidlConnectionInterface {
    private static final String TAG = "FakeHidlConnectionInterfaceImpl";
    private final int EVENT_SIMULATE_5G_DISABLED = 1;
    private final int EVENT_SIMULATE_5G_ENABLED = 0;
    private final int EVENT_SIMULATE_ENABLE_ENDC = 9;
    private final int EVENT_SIMULATE_QUERY_5G_STATUS = 2;
    private final int EVENT_SIMULATE_QUERY_BEARER_ALLOCATION = 4;
    private final int EVENT_SIMULATE_QUERY_CONFIG_TYPE = 7;
    private final int EVENT_SIMULATE_QUERY_ENDC_STATUS = 10;
    private final int EVENT_SIMULATE_QUERY_ICON_TYPE = 8;
    private final int EVENT_SIMULATE_QUERY_NRDC_PARAM = 3;
    private final int EVENT_SIMULATE_QUERY_SIGNAL_STRENGTH = 5;
    private final int EVENT_SIMULATE_QUERY_UPPER_LAYER_IND_INFO = 6;
    /* access modifiers changed from: private */
    public final Token UNSOL = new Token(-1);
    /* access modifiers changed from: private */
    public boolean m5gEnabledState = false;
    /* access modifiers changed from: private */
    public IHidlConnectionCallback mCallback;
    private int mSerial = -1;
    private Handler mWorkerHandler;
    private HandlerThread mWorkerThread = new HandlerThread("FakeHidlConnectionInterfaceImplBgThread");

    private class WorkerHandler extends Handler {
        private static final String TAG = "FakeHidleConnection-WorkerHandler";

        public WorkerHandler() {
        }

        public WorkerHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message msg) {
            DcParam dcParam;
            BearerAllocationStatus bearerAllocationStatus;
            UpperLayerIndInfo upperLayerIndInfo;
            StringBuilder sb = new StringBuilder();
            sb.append("handleMessage msg.what = ");
            sb.append(msg.what);
            String sb2 = sb.toString();
            String str = TAG;
            Log.d(str, sb2);
            SignalStrength signalStrength = null;
            switch (msg.what) {
                case 0:
                    int slotId = msg.arg1;
                    Token token = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("EVENT_SIMULATE_5G_ENABLED: token = ");
                        sb3.append(token);
                        Log.d(str, sb3.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gStatus(slotId, token, new Status(1), true);
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onNrDcParam(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new DcParam(1, 1));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onUpperLayerIndInfo(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new UpperLayerIndInfo(1, 1));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onAnyNrBearerAllocation(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new BearerAllocationStatus(2));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onSignalStrength(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new SignalStrength());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gConfigInfo(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new NrConfigType(0));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onNrIconType(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new NrIconType(1));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gStatus(slotId, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), true);
                        FakeHidlConnectionInterfaceImpl.this.m5gEnabledState = true;
                        return;
                    }
                    return;
                case 1:
                    int slotId2 = msg.arg1;
                    Token token2 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("EVENT_SIMULATE_5G_DISABLED: token = ");
                        sb4.append(token2);
                        Log.d(str, sb4.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gStatus(slotId2, token2, new Status(1), false);
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onNrDcParam(slotId2, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new DcParam(0, 0));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onUpperLayerIndInfo(slotId2, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new UpperLayerIndInfo(0, 0));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onAnyNrBearerAllocation(slotId2, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new BearerAllocationStatus(0));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onSignalStrength(slotId2, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), null);
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onNrIconType(slotId2, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), new NrIconType(0));
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gStatus(slotId2, FakeHidlConnectionInterfaceImpl.this.UNSOL, new Status(1), false);
                        FakeHidlConnectionInterfaceImpl.this.m5gEnabledState = false;
                        return;
                    }
                    return;
                case 2:
                    int slotId3 = msg.arg1;
                    Token token3 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("EVENT_SIMULATE_QUERY_5G_STATUS: token = ");
                        sb5.append(token3);
                        Log.d(str, sb5.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gStatus(slotId3, token3, new Status(1), FakeHidlConnectionInterfaceImpl.this.m5gEnabledState);
                        return;
                    }
                    return;
                case 3:
                    int slotId4 = msg.arg1;
                    Token token4 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("EVENT_SIMULATE_QUERY_NRDC_PARAM: token = ");
                        sb6.append(token4);
                        Log.d(str, sb6.toString());
                        if (FakeHidlConnectionInterfaceImpl.this.m5gEnabledState) {
                            dcParam = new DcParam(1, 1);
                        } else {
                            dcParam = new DcParam(0, 0);
                        }
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onNrDcParam(slotId4, token4, new Status(1), dcParam);
                        return;
                    }
                    return;
                case 4:
                    int slotId5 = msg.arg1;
                    Token token5 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("EVENT_SIMULATE_QUERY_BEARER_ALLOCATION: token = ");
                        sb7.append(token5);
                        Log.d(str, sb7.toString());
                        if (FakeHidlConnectionInterfaceImpl.this.m5gEnabledState) {
                            bearerAllocationStatus = new BearerAllocationStatus(2);
                        } else {
                            bearerAllocationStatus = new BearerAllocationStatus(0);
                        }
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onAnyNrBearerAllocation(slotId5, token5, new Status(1), bearerAllocationStatus);
                        return;
                    }
                    return;
                case 5:
                    int slotId6 = msg.arg1;
                    Token token6 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("EVENT_SIMULATE_QUERY_SIGNAL_STRENGTH: token = ");
                        sb8.append(token6);
                        Log.d(str, sb8.toString());
                        if (FakeHidlConnectionInterfaceImpl.this.m5gEnabledState) {
                            signalStrength = new SignalStrength();
                        }
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onSignalStrength(slotId6, token6, new Status(1), signalStrength);
                        return;
                    }
                    return;
                case 6:
                    int slotId7 = msg.arg1;
                    Token token7 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("EVENT_SIMULATE_QUERY_UPPER_LAYER_IND_INFO: token = ");
                        sb9.append(token7);
                        Log.d(str, sb9.toString());
                        if (FakeHidlConnectionInterfaceImpl.this.m5gEnabledState) {
                            upperLayerIndInfo = new UpperLayerIndInfo(1, 1);
                        } else {
                            upperLayerIndInfo = new UpperLayerIndInfo(0, 0);
                        }
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onUpperLayerIndInfo(slotId7, token7, new Status(1), upperLayerIndInfo);
                        return;
                    }
                    return;
                case 7:
                    int slotId8 = msg.arg1;
                    Token token8 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("EVENT_SIMULATE_QUERY_CONFIG_TYPE: token = ");
                        sb10.append(token8);
                        Log.d(str, sb10.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.on5gConfigInfo(slotId8, token8, new Status(1), new NrConfigType(0));
                        return;
                    }
                    return;
                case 8:
                    int slotId9 = msg.arg1;
                    Token token9 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("EVENT_SIMULATE_QUERY_ICON_TYPE: token = ");
                        sb11.append(token9);
                        Log.d(str, sb11.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onNrIconType(slotId9, token9, new Status(1), new NrIconType(1));
                        return;
                    }
                    return;
                case 9:
                    int slotId10 = msg.arg1;
                    Token token10 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("EVENT_SIMULATE_ENABLE_ENDC: token = ");
                        sb12.append(token10);
                        Log.d(str, sb12.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onEnableEndc(slotId10, token10, new Status(1));
                        return;
                    }
                    return;
                case 10:
                    int slotId11 = msg.arg1;
                    Token token11 = (Token) msg.obj;
                    if (FakeHidlConnectionInterfaceImpl.this.mCallback != null) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("EVENT_SIMULATE_QUERY_ENDC_STATUS: token = ");
                        sb13.append(token11);
                        Log.d(str, sb13.toString());
                        FakeHidlConnectionInterfaceImpl.this.mCallback.onEndcStatus(slotId11, token11, new Status(1), true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public FakeHidlConnectionInterfaceImpl() {
        this.mWorkerThread.start();
        Looper workerLooper = this.mWorkerThread.getLooper();
        this.mWorkerHandler = new WorkerHandler(workerLooper);
        StringBuilder sb = new StringBuilder();
        sb.append("constructor... using its own bg thread Looper = ");
        sb.append(workerLooper);
        Log.d(TAG, sb.toString());
    }

    public FakeHidlConnectionInterfaceImpl(Looper workerLooper) {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor... Looper = ");
        sb.append(workerLooper);
        Log.d(TAG, sb.toString());
        this.mWorkerHandler = new WorkerHandler(workerLooper);
    }

    private Token getNextToken() {
        int i = this.mSerial + 1;
        this.mSerial = i;
        return new Token(i);
    }

    public Token enable5g(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "enable5g: ");
        Token token = getNextToken();
        if (this.mCallback != null) {
            Handler handler = this.mWorkerHandler;
            handler.sendMessageDelayed(handler.obtainMessage(0, slotId, -1, token), 2000);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("enable5g: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token disable5g(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "disable5g: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessageDelayed(handler.obtainMessage(1, slotId, -1, token), 2000);
        StringBuilder sb = new StringBuilder();
        sb.append("disable5g: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token enable5gOnly(int slotId) throws RemoteException {
        return null;
    }

    public Token query5gStatus(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "query5gStatus: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(2, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("query5gStatus: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token query5gConfigInfo(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "query5gConfigInfo: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(7, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("query5gConfigInfo: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token queryNrDcParam(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "queryNrDcParam: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(3, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("queryNrDcParam: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token queryNrBearerAllocation(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "queryNrBearerAllocation: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(4, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("queryNrBearerAllocation: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token queryNrSignalStrength(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "queryNrSignalStrength: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(5, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("queryNrSignalStrength: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token queryUpperLayerIndInfo(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "queryUpperLayerIndInfo: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(6, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("queryUpperLayerIndInfo: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token queryNrIconType(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "queryNrIconType: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(8, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("queryNrIconType: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token enableEndc(int slotId, boolean enable) throws RemoteException {
        String str = TAG;
        Log.d(str, "enableEndc: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(9, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("enableEndc: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public Token queryEndcStatus(int slotId) throws RemoteException {
        String str = TAG;
        Log.d(str, "queryEndcStatus: ");
        Token token = getNextToken();
        Handler handler = this.mWorkerHandler;
        handler.sendMessage(handler.obtainMessage(10, slotId, -1, token));
        StringBuilder sb = new StringBuilder();
        sb.append("queryEndcStatus: token = ");
        sb.append(token);
        Log.d(str, sb.toString());
        return token;
    }

    public void registerCallback(IHidlConnectionCallback callback) {
        StringBuilder sb = new StringBuilder();
        sb.append("registerCallback: callback = ");
        sb.append(callback);
        Log.d(TAG, sb.toString());
        this.mCallback = callback;
    }

    public void unRegisterCallback(IHidlConnectionCallback callback) {
        StringBuilder sb = new StringBuilder();
        sb.append("unRegisterCallback: callback = ");
        sb.append(callback);
        Log.d(TAG, sb.toString());
        if (this.mCallback == callback) {
            this.mCallback = null;
        }
    }
}
