package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class CdmaSmsSubaddressType {
    public static final int NSAP = 0;
    public static final int USER_SPECIFIED = 1;

    public static final String toString(int o) {
        if (o == 0) {
            return "NSAP";
        }
        if (o == 1) {
            return "USER_SPECIFIED";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("NSAP");
        if ((o & 1) == 1) {
            list.add("USER_SPECIFIED");
            flipped = 0 | 1;
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
