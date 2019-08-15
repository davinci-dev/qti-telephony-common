package com.qualcomm.qti.internal.telephony.primarycard;

import android.content.Context;
import android.hardware.radio.V1_0.RadioAccessFamily;
import android.os.SystemProperties;
import android.provider.Settings.Global;
import android.telephony.Rlog;
import android.telephony.TelephonyManager;
import com.qualcomm.qti.internal.telephony.QtiRilInterface;

public class QtiPrimaryCardUtils {
    public static final int COMPARE_CARDTYPE = 2;
    public static final int COMPARE_IIN_CARDTYPE = 1;
    public static final int COMPARE_MCCMNC = 3;
    private static final String CONFIG_CURRENT_PRIMARY_SUB = "config_current_primary_sub";
    private static final String CONFIG_DISABLE_DDS_PREFERENCE = "config_disable_dds_preference";
    private static final String CONFIG_PRIMARY_SUB_IS_SETABLE = "config_primary_sub_is_setable";
    private static final String CONFIG_SUB_SELECT_MODE_MANUAL = "config_sub_select_mode_manual";
    private static final boolean DBG = true;
    private static final String DETECT_4G_CARD_PROPERTY_NAME = "persist.vendor.radio.detect4gcard";
    public static final int DISABLE_USER_SELECTION = 1;
    private static final String LOG_TAG = "QtiPcUtils";
    public static final int PHONE_COUNT = TelephonyManager.getDefault().getPhoneCount();
    private static final String PRIMARY_CARD_PROPERTY_NAME = "persist.vendor.radio.primarycard";
    private static final boolean PRIMCARYCARD_L_W_ENABLED = SystemProperties.getBoolean("persist.vendor.radio.lw_enabled", PRIMCARYCARD_L_W_ENABLED);
    private static final int RAF_CDMA = 112;
    private static final int RAF_EVDO = 12672;
    public static final int SHOW_USER_SELECTION_FOR_EVERY_CHANGE = 3;
    public static final int SHOW_USER_SELECTION_ON_PRIORITY_MATCH = 2;
    public static final int SLOT_ID_0 = 0;
    public static final int SLOT_ID_1 = 1;
    public static final int SLOT_INVALID = -1;
    public static final int SLOT_PRIORITY_MATCH = -2;
    private static final boolean VDBG = true;
    private static int mConfigValue = 0;
    private static Context mContext;
    private static QtiPrimaryCardUtils sInstance;

    public enum ConfigBits {
        RESERVED_1(1),
        READ_4G_FLAG(2),
        SET_PRIMARY_ON_DEACT(4),
        DEFAULT_PRIMARY_SLOT_1(8),
        DEFAULT_NWMODE_GSM(16),
        DEFAULT_NWMODE_GW(32),
        DEFAULT_NWMODE_GCWTL(64),
        DISABLE_USER_SELECTION(64),
        SHOW_USER_SELECTION_ON_PRIORITY_MATCH(128),
        SHOW_USER_SELECTION_FOR_EVERY_CHANGE(192),
        COMPARE_IIN_CARDTYPE(256),
        COMPARE_CARDTYPE(512),
        COMPARE_MCCMNC(768),
        DISABLE_DDS(2048),
        PRIORITY_CONFIG_1(4096),
        PRIORITY_CONFIG_2(RadioAccessFamily.EHRPD),
        PRIORITY_CONFIG_3(RadioAccessFamily.LTE),
        PRIORITY_CONFIG_4(RadioAccessFamily.HSPAP),
        PRIORITY_SUBSIDY_LOCKED_CONFIG(49152);
        
        private int mValue;

        private ConfigBits(int value) {
            this.mValue = value;
        }

        /* access modifiers changed from: 0000 */
        public int value() {
            return this.mValue;
        }
    }

    static QtiPrimaryCardUtils init(Context context) {
        synchronized (QtiPrimaryCardUtils.class) {
            if (sInstance == null) {
                sInstance = new QtiPrimaryCardUtils(context);
            }
        }
        return sInstance;
    }

    public static QtiPrimaryCardUtils getInstance() {
        QtiPrimaryCardUtils qtiPrimaryCardUtils;
        synchronized (QtiPrimaryCardUtils.class) {
            if (sInstance != null) {
                qtiPrimaryCardUtils = sInstance;
            } else {
                throw new RuntimeException("QtiPrimaryCardUtils was not initialized!");
            }
        }
        return qtiPrimaryCardUtils;
    }

    private QtiPrimaryCardUtils(Context context) {
        mContext = context;
        setConfigValue();
    }

    protected static void setConfigValue() {
        int nwmodeConfig;
        QtiRilInterface qtiRilInterface = QtiRilInterface.getInstance(mContext);
        StringBuilder sb = new StringBuilder();
        sb.append("oemhook service status: ");
        sb.append(qtiRilInterface.isServiceReady());
        logd(sb.toString());
        if (qtiRilInterface.isServiceReady()) {
            boolean isLpluslSupport = qtiRilInterface.getLpluslSupportStatus();
        }
        boolean isSubsidyLockFeatureEnabled = SubsidyLockSettingsObserver.isSubsidyLockFeatureEnabled();
        boolean isPermanentlyUnlocked = true;
        boolean isSubsidyLockedOrRestricted = isSubsidyLockFeatureEnabled && (SubsidyLockSettingsObserver.isSubsidyLocked(mContext) || SubsidyLockSettingsObserver.isSubsidyUnlocked(mContext));
        if (!isSubsidyLockFeatureEnabled || !SubsidyLockSettingsObserver.isPermanentlyUnlocked(mContext)) {
            isPermanentlyUnlocked = false;
        }
        if (isSubsidyLockedOrRestricted) {
            mConfigValue = ConfigBits.PRIORITY_SUBSIDY_LOCKED_CONFIG.value() | ConfigBits.COMPARE_MCCMNC.value() | ConfigBits.SET_PRIMARY_ON_DEACT.value() | ConfigBits.COMPARE_CARDTYPE.value() | ConfigBits.SHOW_USER_SELECTION_ON_PRIORITY_MATCH.value();
        } else if (isDetect4gCardEnabled() || isPermanentlyUnlocked) {
            if (PRIMCARYCARD_L_W_ENABLED) {
                nwmodeConfig = ConfigBits.DEFAULT_NWMODE_GW.value();
            } else {
                nwmodeConfig = ConfigBits.DEFAULT_NWMODE_GSM.value();
            }
            mConfigValue = ConfigBits.PRIORITY_CONFIG_2.value() | ConfigBits.COMPARE_CARDTYPE.value() | nwmodeConfig | ConfigBits.READ_4G_FLAG.value() | ConfigBits.SET_PRIMARY_ON_DEACT.value() | ConfigBits.SHOW_USER_SELECTION_FOR_EVERY_CHANGE.value();
        } else if (isCmccPrimaryCardFeatureEnabled(mContext)) {
            mConfigValue = ConfigBits.PRIORITY_CONFIG_4.value() | ConfigBits.COMPARE_IIN_CARDTYPE.value() | ConfigBits.DEFAULT_NWMODE_GCWTL.value() | ConfigBits.SET_PRIMARY_ON_DEACT.value() | ConfigBits.SHOW_USER_SELECTION_ON_PRIORITY_MATCH.value();
        } else if (isPrimaryCardFeatureEnabled(mContext)) {
            mConfigValue = ConfigBits.PRIORITY_CONFIG_3.value() | ConfigBits.COMPARE_IIN_CARDTYPE.value() | ConfigBits.DEFAULT_NWMODE_GSM.value() | ConfigBits.SET_PRIMARY_ON_DEACT.value() | ConfigBits.SHOW_USER_SELECTION_ON_PRIORITY_MATCH.value();
        } else {
            mConfigValue = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ConfigValue is:");
        sb2.append(mConfigValue);
        sb2.append(", in Binary:");
        sb2.append(Integer.toString(mConfigValue, 2));
        logd(sb2.toString());
    }

    public static String getConfigXml() {
        if (isBitSetInConfig(ConfigBits.PRIORITY_CONFIG_4)) {
            logd("use priority_config_4.xml");
            return "priority_config_4";
        } else if (isBitSetInConfig(ConfigBits.PRIORITY_SUBSIDY_LOCKED_CONFIG)) {
            return "subsidy_feature_config";
        } else {
            if (isBitSetInConfig(ConfigBits.PRIORITY_CONFIG_3)) {
                return "priority_config_3";
            }
            if (isBitSetInConfig(ConfigBits.PRIORITY_CONFIG_2)) {
                return "priority_config_2";
            }
            if (isBitSetInConfig(ConfigBits.PRIORITY_CONFIG_1)) {
                return "priority_config_1";
            }
            return "priority_config_2";
        }
    }

    public static int getDefaultNwMode() {
        int defNwMode = 1;
        if (isBitSetInConfig(ConfigBits.DEFAULT_NWMODE_GSM)) {
            defNwMode = 1;
        } else if (isBitSetInConfig(ConfigBits.DEFAULT_NWMODE_GW)) {
            defNwMode = 0;
        } else if (isBitSetInConfig(ConfigBits.DEFAULT_NWMODE_GCWTL)) {
            defNwMode = 22;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getDefaultNwMode: ");
        sb.append(defNwMode);
        logv(sb.toString());
        return defNwMode;
    }

    public static int getPriorityConfigComparator() {
        int comparator = 2;
        if (isBitSetInConfig(ConfigBits.COMPARE_MCCMNC)) {
            comparator = 3;
        } else if (isBitSetInConfig(ConfigBits.COMPARE_CARDTYPE)) {
            comparator = 2;
        } else if (isBitSetInConfig(ConfigBits.COMPARE_IIN_CARDTYPE)) {
            comparator = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getPriorityConfigComparator: ");
        sb.append(comparator);
        logv(sb.toString());
        return comparator;
    }

    public static int getDefaultPrimarySlot() {
        int defPrimarySlot = isBitSetInConfig(ConfigBits.DEFAULT_PRIMARY_SLOT_1);
        StringBuilder sb = new StringBuilder();
        sb.append("getDefaultPrimarySlot: ");
        sb.append((int) defPrimarySlot);
        logv(sb.toString());
        return defPrimarySlot;
    }

    public static boolean setPrimaryCardOnDeAct() {
        boolean setPcOnDeact = isBitSetInConfig(ConfigBits.SET_PRIMARY_ON_DEACT);
        StringBuilder sb = new StringBuilder();
        sb.append("setPrimaryCardOnDeAct: ");
        sb.append(setPcOnDeact);
        logv(sb.toString());
        return setPcOnDeact;
    }

    public static boolean read4gFlag() {
        boolean read4g = isBitSetInConfig(ConfigBits.READ_4G_FLAG);
        StringBuilder sb = new StringBuilder();
        sb.append("read4gFlag: ");
        sb.append(read4g);
        logv(sb.toString());
        return read4g;
    }

    public static boolean disableDds() {
        boolean disableDds = isBitSetInConfig(ConfigBits.DISABLE_DDS);
        StringBuilder sb = new StringBuilder();
        sb.append("disableDds: ");
        sb.append(disableDds);
        logv(sb.toString());
        return disableDds;
    }

    public static int getUserSelectionMode() {
        int userSelMode = 1;
        if (isBitSetInConfig(ConfigBits.SHOW_USER_SELECTION_FOR_EVERY_CHANGE)) {
            userSelMode = 3;
        } else if (isBitSetInConfig(ConfigBits.SHOW_USER_SELECTION_ON_PRIORITY_MATCH)) {
            userSelMode = 2;
        } else if (isBitSetInConfig(ConfigBits.DISABLE_USER_SELECTION)) {
            userSelMode = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getUserSelectionMode: ");
        sb.append(userSelMode);
        logv(sb.toString());
        return userSelMode;
    }

    private static boolean isBitSetInConfig(ConfigBits config) {
        if ((mConfigValue & config.value()) == config.value()) {
            return true;
        }
        return PRIMCARYCARD_L_W_ENABLED;
    }

    public static int getCurrentPrimarySlotFromDB(Context context) {
        return Global.getInt(context.getContentResolver(), CONFIG_CURRENT_PRIMARY_SUB, -1);
    }

    public static void savePrimarySlotToDB(int primarySlot) {
        getInstance();
        Global.putInt(mContext.getContentResolver(), CONFIG_CURRENT_PRIMARY_SUB, primarySlot);
    }

    public static void saveEnableUserSelectioninDB(boolean enableUserSel) {
        getInstance();
        Global.putInt(mContext.getContentResolver(), CONFIG_SUB_SELECT_MODE_MANUAL, enableUserSel);
    }

    public static void saveDisableDdsPreferenceInDB(boolean disableDds) {
        getInstance();
        Global.putInt(mContext.getContentResolver(), CONFIG_DISABLE_DDS_PREFERENCE, disableDds);
    }

    public static void savePrimarySetable(boolean isSetable) {
        getInstance();
        Global.putInt(mContext.getContentResolver(), CONFIG_PRIMARY_SUB_IS_SETABLE, isSetable);
    }

    public static boolean isPrimaryCardFeatureEnabled(Context context) {
        if ((SystemProperties.getBoolean(PRIMARY_CARD_PROPERTY_NAME, PRIMCARYCARD_L_W_ENABLED) || context.getResources().getBoolean(17957010)) && PHONE_COUNT > 1) {
            return true;
        }
        return PRIMCARYCARD_L_W_ENABLED;
    }

    public static boolean isCmccPrimaryCardFeatureEnabled(Context context) {
        if (!context.getResources().getBoolean(17957010) || PHONE_COUNT <= 1) {
            return PRIMCARYCARD_L_W_ENABLED;
        }
        return true;
    }

    public static boolean isDetect4gCardEnabled() {
        if (!SystemProperties.getBoolean(PRIMARY_CARD_PROPERTY_NAME, PRIMCARYCARD_L_W_ENABLED) || !SystemProperties.getBoolean(DETECT_4G_CARD_PROPERTY_NAME, PRIMCARYCARD_L_W_ENABLED) || PHONE_COUNT <= 1) {
            return PRIMCARYCARD_L_W_ENABLED;
        }
        return true;
    }

    public static boolean is3gpp2NwMode(int nwMode) {
        int raf = android.telephony.RadioAccessFamily.getRafFromNetworkType(nwMode);
        if ((raf & 112) == 112 || (raf & RAF_EVDO) == RAF_EVDO) {
            return true;
        }
        return PRIMCARYCARD_L_W_ENABLED;
    }

    private static void logd(String string) {
        Rlog.d(LOG_TAG, string);
    }

    private static void logv(String string) {
        Rlog.d(LOG_TAG, string);
    }

    private void logi(String string) {
        Rlog.i(LOG_TAG, string);
    }

    private void loge(String string) {
        Rlog.e(LOG_TAG, string);
    }
}