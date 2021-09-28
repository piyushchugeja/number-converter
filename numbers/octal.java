package numbers;

public class octal {
    public static String octalToDecimal(String octal) {
        try {
            return Integer.toString(Integer.parseInt(octal, 8));
        }
        catch (Exception e) {
            throw e;
        }
    }

    public static String octalToBinary(String octal) throws Exception {
        return Integer.toBinaryString(Integer.parseInt(octal, 8));
    }

    public static String octaltoHexa(String octal) throws Exception {
        return Integer.toHexString(Integer.parseInt(octal, 8));
    }
}
