public class HexadecimalOperations {
    public static String hexaToDecimal(String hexa) throws Exception {
        return Integer.toString(Integer.decode("0X".concat(hexa)));
    }

    public static String hexaToBinary(String hexa) throws Exception {
        return Integer.toBinaryString(Integer.decode("0X".concat(hexa)));
    }

    public static String hexaToOctal(String hexa) throws Exception {
        return Integer.toOctalString(Integer.decode("0X".concat(hexa)));
    }
}
