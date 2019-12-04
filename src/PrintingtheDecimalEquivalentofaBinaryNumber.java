import java.util.Scanner;

public class PrintingtheDecimalEquivalentofaBinaryNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int binaryNumber = input.nextInt();

        int var;
        int i = 0;
        double decimalNumber = 0.0;

        while (binaryNumber != 0) {
            var = binaryNumber % 10;
            decimalNumber = decimalNumber + var * Math.pow(2, i);
            binaryNumber = binaryNumber / 10;
            i++;
        }

        System.out.println("\nDecimal number is:" + decimalNumber);
    }
}
