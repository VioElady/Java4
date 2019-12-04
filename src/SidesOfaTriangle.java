import java.util.Scanner;

public class SidesOfaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int n = input.nextInt();
        System.out.print("Enter second side: ");
        int m = input.nextInt();
        System.out.print("Enter third side: ");
        int x = input.nextInt();

        if ((n > 0) && (m > 0) && (x > 0) && (n + m > x) && (n + x > m) && (m + x > n)) {
            System.out.println("The triangle is represented!");
        } else {
            System.out.println("The triangle isn't represented!");

        }
    }
}