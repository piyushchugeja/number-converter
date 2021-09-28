package numbers;

public class hex {
    public static String hexaToDecimal(String hexa) {
        try {
            Integer decimal=Integer.decode("0X".concat(hexa));
            return Integer.toString(decimal);
        }
        catch (Exception e) {
            throw e;
        }
    }

    public static String hexaToBinary(String hexa) {
        try {
            Integer binary=Integer.decode("0X".concat(hexa));
            return Integer.toBinaryString(binary);
        }
        catch (Exception e) {
            throw e;
        }
    }

    public static String hexaToOctal(String hexa) {
        try {
            Integer octal=Integer.decode("0X".concat(hexa));
            return Integer.toOctalString(octal);
        }
        catch (Exception e) {
            throw e;
        }
    }
}
