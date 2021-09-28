package numbers;

public class binary {
    public static String binaryToDecimal(String bin) {
        try {
            Integer decimal=Integer.parseInt(bin, 2);
            return decimal.toString();
        }
        catch (Exception e) {
            throw e;
        }
    }

    public static String binaryToHex(String bin) {
        try {
            Integer hex=Integer.parseInt(bin, 2);
            return Integer.toHexString(hex);
        }
        catch (Exception e) {
            throw e;
        }
    }
    public static String binaryToOctal(String bin) {
        try {
            Integer octal=Integer.parseInt(bin, 2);
            return Integer.toOctalString(octal); 
        }
        catch (Exception e) {
            throw e;
        }
    }
}
