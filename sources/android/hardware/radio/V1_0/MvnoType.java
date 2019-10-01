package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class MvnoType {
    public static final int GID = 2;
    public static final int IMSI = 1;
    public static final int NONE = 0;
    public static final int SPN = 3;

    public static final String toString(int o) {
        if (o == 0) {
            return "NONE";
        }
        if (o == 1) {
            return "IMSI";
        }
        if (o == 2) {
            return "GID";
        }
        if (o == 3) {
            return "SPN";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("NONE");
        if ((o & 1) == 1) {
            list.add("IMSI");
            flipped = 0 | 1;
        }
        if ((o & 2) == 2) {
            list.add("GID");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("SPN");
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
