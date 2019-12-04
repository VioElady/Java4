
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for factorial:");
        int number = input.nextInt();

        double factorial = 1;
        factorial = Factorial(number);
        System.out.printf("\nThis number !%d is factorial: %.2f", number, factorial);

        // b) estimates the value of the mathematical constant e
        double e = 0;
        System.out.println("\nEnter number of terms for estimates the value of the mathematical constant e: ");
        int numberOfTerms = input.nextInt();

        System.out.print("e = 1");
        for (int i = 1; i <= numberOfTerms; i++) {
            e += 1 / Factorial(i);
            System.out.printf(" + 1 /%d! ", i);
        }
        System.out.printf(" = %.2f", e + 1);

        // c) computes the value of e^x

        System.out.println("\nEnter x :");
        int x = input.nextInt();
        System.out.println("Enter number of terms or computes the value of e^x:");
        numberOfTerms = input.nextInt();
        double rez = 0;

        System.out.print("e^x = 1");
        for (int i = 1; i <= numberOfTerms; i++) {
            rez = rez + Math.pow(x, i) / Factorial(i);
            System.out.printf(" + %d^%d /%d!", x, i, i);
        }
        System.out.printf(" = %.2f", rez + 1);
    }

    public static double Factorial(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;
        }
        return factor;
    }
}
