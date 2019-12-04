import java.util.Scanner;

class SquareOfAsterisks {
    static void print_rectangle(int n, int m) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of a square :");
        size = input.nextInt();
        print_rectangle(size,size);

    }
}