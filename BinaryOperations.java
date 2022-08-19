public class BinaryOperations {
    public static String binaryToDecimal(String bin) throws Exception {
        return Integer.toString(Integer.parseInt(bin, 2));
    }
    public static String binaryToHex(String bin) throws Exception {
        return Integer.toHexString(Integer.parseInt(bin, 2)).toUpperCase();
    }
    public static String binaryToOctal(String bin) throws Exception {
        return Integer.toOctalString(Integer.parseInt(bin, 2));
    }
}