package vendor.qti.hardware.radio.qtiradio.V2_0;

import java.util.ArrayList;

public final class RestrictDcnrType {
    public static final int DCNR_RESTRICTED = 0;
    public static final int DCNR_UNRESTRICTED = 1;
    public static final int INVALID = -1;

    public static final String toString(int o) {
        if (o == -1) {
            return "INVALID";
        }
        if (o == 0) {
            return "DCNR_RESTRICTED";
        }
        if (o == 1) {
            return "DCNR_UNRESTRICTED";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        if ((o & -1) == -1) {
            list.add("INVALID");
            flipped = 0 | -1;
        }
        list.add("DCNR_RESTRICTED");
        if ((o & 1) == 1) {
            list.add("DCNR_UNRESTRICTED");
            flipped |= 1;
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
