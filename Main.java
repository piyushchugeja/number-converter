//testing the functions
import numbers.*;
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("\nConverting 13 octal to binary. Answer: " + octal.octalToBinary("13"));
            System.out.println("\nConverting 12 octal to decimal. Answer: " + octal.octalToDecimal("12"));
	    System.out.println("\nConverting 47 hex to binary. Answer: " + hex.hexaToBinary("47"));
            System.out.println("\nConverting 1000101 binary to decimal. Answer: " + binary. binaryToDecimal("1000101"));
        }
        catch (Exception e) {
            System.out.println("\nOops");
        }
    }
}
