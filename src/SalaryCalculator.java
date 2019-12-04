import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrEmployees;
        int numberHoursWorked;
        int hourlyRates;
        double grossPay;

        System.out.println("How many employees do you have?");
        nrEmployees = input.nextInt();


        for (int i = 0; i < nrEmployees; i++) {

            System.out.println("How many number hours worked do you have?");
            numberHoursWorked = input.nextInt();
            System.out.println("How many hourly rates do you have?");
            hourlyRates = input.nextInt();

            if (numberHoursWorked > 40)
                grossPay = (double) (40 * hourlyRates) + (numberHoursWorked - 40) * hourlyRates * 1.5;
            else
                grossPay = numberHoursWorked * hourlyRates;

            System.out.println("\nEmployee’s gross pay is "+ grossPay);
        }
    }
}
