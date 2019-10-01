package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class SapApduType {
    public static final int APDU = 0;
    public static final int APDU7816 = 1;

    public static final String toString(int o) {
        if (o == 0) {
            return "APDU";
        }
        if (o == 1) {
            return "APDU7816";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("APDU");
        if ((o & 1) == 1) {
            list.add("APDU7816");
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
