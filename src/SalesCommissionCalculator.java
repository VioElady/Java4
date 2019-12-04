import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double itemValue;
        double salespersonEarnings;

        do {
            System.out.println("\nEnter item value or -1 for exit ");
            itemValue = input.nextDouble();
            salespersonEarnings = 200 + itemValue * 0.09;
            if (itemValue == -1)
                continue;
            System.out.println("\nSeller earning " + salespersonEarnings);
        } while (itemValue != -1);
    }
}