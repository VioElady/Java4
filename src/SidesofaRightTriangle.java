import java.util.Scanner;

public class SidesofaRightTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side:");
        int n = input.nextInt();
        System.out.print("Enter second side: ");
        int m = input.nextInt();
        System.out.print("Enter third side: ");
        int x = input.nextInt();

        if ((n > 0) && (m > 0) && (x > 0) &&
                ((Math.pow(n, 2) + Math.pow(m, 2) == Math.pow(x, 2)) ||
                        (Math.pow(n, 2) + Math.pow(x, 2) == Math.pow(m, 2)) ||
                        (Math.pow(m, 2) + Math.pow(x, 2) == Math.pow(n, 2)))) {
            System.out.println("The right triangle is represented!");
        } else {
            System.out.println("The right triangle isn't represented");
        }
    }
}