package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class DataProfileInfoType {
    public static final int COMMON = 0;
    public static final int THREE_GPP = 1;
    public static final int THREE_GPP2 = 2;

    public static final String toString(int o) {
        if (o == 0) {
            return "COMMON";
        }
        if (o == 1) {
            return "THREE_GPP";
        }
        if (o == 2) {
            return "THREE_GPP2";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("COMMON");
        if ((o & 1) == 1) {
            list.add("THREE_GPP");
            flipped = 0 | 1;
        }
        if ((o & 2) == 2) {
            list.add("THREE_GPP2");
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
