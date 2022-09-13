package ProblemSolving4;

import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int p = n % 4 == 0 ? (n/4)-1 : n / 4;
            ++p;
            for (int i = 0; i < n - p; i++) {
                System.out.print("9");
            }
            for (int i = 0; i < p; i++) {
                System.out.print("8");
            }
            System.out.println();

        }
    }

}
