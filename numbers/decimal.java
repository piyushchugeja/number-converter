package numbers;

public class decimal {
    public static String decimalToBinary(String dec) {
        try {
            Integer binary=Integer.parseInt(dec);
            return Integer.toBinaryString(binary);
        }
        catch (Exception e) {
            throw e;
        }
    }

    public static String decimalToHex(String dec) {
        try {
            Integer hexa=Integer.parseInt(dec);
            return Integer.toHexString(hexa);
        }
        catch (Exception e) {
            throw e;
        }
    }

    public static String decimalToOctal(String dec) {
        try {
            return Integer.toOctalString(Integer.parseInt(dec));
        }
        catch (Exception e) {
            throw e;
        }
    }
}
