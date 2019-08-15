package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class OperatorStatus {
    public static final int AVAILABLE = 1;
    public static final int CURRENT = 2;
    public static final int FORBIDDEN = 3;
    public static final int UNKNOWN = 0;

    public static final String toString(int o) {
        if (o == 0) {
            return "UNKNOWN";
        }
        if (o == 1) {
            return "AVAILABLE";
        }
        if (o == 2) {
            return "CURRENT";
        }
        if (o == 3) {
            return "FORBIDDEN";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN");
        if ((o & 1) == 1) {
            list.add("AVAILABLE");
            flipped = 0 | 1;
        }
        if ((o & 2) == 2) {
            list.add("CURRENT");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("FORBIDDEN");
            flipped |= 3;
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
