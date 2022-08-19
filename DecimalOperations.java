public class DecimalOperations {
    public static String decimalToBinary(String dec) throws Exception {
        return Integer.toBinaryString(Integer.parseInt(dec));
    }

    public static String decimalToHex(String dec) throws Exception {
        return Integer.toHexString(Integer.parseInt(dec)).toUpperCase();
    }

    public static String decimalToOctal(String dec) throws Exception {
        return Integer.toOctalString(Integer.parseInt(dec));
    }
}
