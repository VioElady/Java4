import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {

        int counter;
        int largest =0;
        int number=10;

        System.out.println("Enter the number:");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < number; i++) {
            counter = input.nextInt();
            if (counter > largest) {
                largest = counter;
            }
        }
        System.out.println("The largest is:" + largest);
    }
}
