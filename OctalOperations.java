public class OctalOperations {
    public static String octalToDecimal(String octal) {
        return Integer.toString(Integer.parseInt(octal, 8));
    }

    public static String octalToBinary(String octal) throws Exception {
        return Integer.toBinaryString(Integer.parseInt(octal, 8));
    }

    public static String octalToHexa(String octal) throws Exception {
        return Integer.toHexString(Integer.parseInt(octal, 8)).toUpperCase();
    }
}