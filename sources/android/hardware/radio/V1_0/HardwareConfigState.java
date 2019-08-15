package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class HardwareConfigState {
    public static final int DISABLED = 2;
    public static final int ENABLED = 0;
    public static final int STANDBY = 1;

    public static final String toString(int o) {
        if (o == 0) {
            return "ENABLED";
        }
        if (o == 1) {
            return "STANDBY";
        }
        if (o == 2) {
            return "DISABLED";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("ENABLED");
        if ((o & 1) == 1) {
            list.add("STANDBY");
            flipped = 0 | 1;
        }
        if ((o & 2) == 2) {
            list.add("DISABLED");
            flipped |= 2;
        }
        if (o != flipped) {
            StringBuilder sb = new StringBuilder();
            sb.append("0x");
            sb.append(Integer.toHexString((~flipped) & o));
            list.add(sb.toString());
        }
        return String.join(" | ", list);
    }
}
