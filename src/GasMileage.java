import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int milesDriven = 0;
        int gallons = 0;
        int total = 0;

        while (milesDriven != -1) {
            System.out.print("Enter miles driven: ");
            milesDriven = input.nextInt();
            if (milesDriven == -1) {
                continue;
            }
            System.out.print("Enter gallons: ");
            gallons = input.nextInt();
            int y = milesDriven / gallons;
            System.out.println(y);
            total += y;
            System.out.println("The miles par gallons are :" + total);

        }

    }
}
