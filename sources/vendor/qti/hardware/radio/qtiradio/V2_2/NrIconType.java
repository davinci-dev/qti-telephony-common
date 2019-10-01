package vendor.qti.hardware.radio.qtiradio.V2_2;

import java.util.ArrayList;

public final class NrIconType {
    public static final int INVALID = -1;
    public static final int TYPE_5G_BASIC = 1;
    public static final int TYPE_5G_UWB = 2;
    public static final int TYPE_NONE = 0;

    public static final String toString(int o) {
        if (o == -1) {
            return "INVALID";
        }
        if (o == 0) {
            return "TYPE_NONE";
        }
        if (o == 1) {
            return "TYPE_5G_BASIC";
        }
        if (o == 2) {
            return "TYPE_5G_UWB";
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
        list.add("TYPE_NONE");
        if ((o & 1) == 1) {
            list.add("TYPE_5G_BASIC");
            flipped |= 1;
        }
        if ((o & 2) == 2) {
            list.add("TYPE_5G_UWB");
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
