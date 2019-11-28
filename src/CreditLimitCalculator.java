
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber;
        int balanceBTM;
        int charges;
        int totalCredits;
        int creditLimit;
        int balance;

        System.out.println("How many customers do you have?");
        int nrCustomers = input.nextInt();

        for (int i = 0; i < nrCustomers; i++) {
            System.out.println("\nAccount number is ");
            accountNumber = input.nextInt();
            System.out.println("\nBalance at the beginning of the month is");
            balanceBTM = input.nextInt();
            System.out.println("\nTotal of all items  charged by the customer this month is ");
            charges = input.nextInt();
            System.out.println("\nTotal of all  credits is ");
            totalCredits = input.nextInt();
            System.out.println("\nAllowed limit credit is ");
            creditLimit = input.nextInt();

            balance = balanceBTM - charges + totalCredits;

            if (balance > creditLimit) {
                System.out.println("The credit limit is exceeded :"+ balance);
            } else {
                System.out.println("The credit is "+balance);
            }
        }
    }
}

