import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Palindromes {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your  number of five letters: ");
            str = input.next();
            if (str.length() == 5) {
                try {
                    number = parseInt(str);
                    if (number > 0) {
                        isValid = true;
                    }
                } catch (NumberFormatException e) {
                }
            }

            if (isPalindrome(str))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }

}