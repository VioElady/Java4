import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        int n = 7;
        int largest1;
        int largest2;
        int numb;
        largest1 = largest2 = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter number : ");
            numb = input.nextInt();
            if (numb > largest1) {
                largest2 = largest1;
                largest1 = numb;
            } else if (numb > largest2) {
                largest2 = numb;
            }
        }
        System.out.println("The largest1 is " + largest1);
        System.out.println("The largest2 is " + largest2);
    }
}