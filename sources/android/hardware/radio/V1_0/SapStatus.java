package android.hardware.radio.V1_0;

import java.util.ArrayList;

public final class SapStatus {
    public static final int CARD_INSERTED = 4;
    public static final int CARD_NOT_ACCESSIBLE = 2;
    public static final int CARD_REMOVED = 3;
    public static final int CARD_RESET = 1;
    public static final int RECOVERED = 5;
    public static final int UNKNOWN_ERROR = 0;

    public static final String toString(int o) {
        if (o == 0) {
            return "UNKNOWN_ERROR";
        }
        if (o == 1) {
            return "CARD_RESET";
        }
        if (o == 2) {
            return "CARD_NOT_ACCESSIBLE";
        }
        if (o == 3) {
            return "CARD_REMOVED";
        }
        if (o == 4) {
            return "CARD_INSERTED";
        }
        if (o == 5) {
            return "RECOVERED";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(o));
        return sb.toString();
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN_ERROR");
        if ((o & 1) == 1) {
            list.add("CARD_RESET");
            flipped = 0 | 1;
        }
        if ((o & 2) == 2) {
            list.add("CARD_NOT_ACCESSIBLE");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("CARD_REMOVED");
            flipped |= 3;
        }
        if ((o & 4) == 4) {
            list.add("CARD_INSERTED");
            flipped |= 4;
        }
        if ((o & 5) == 5) {
            list.add("RECOVERED");
            flipped |= 5;
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
