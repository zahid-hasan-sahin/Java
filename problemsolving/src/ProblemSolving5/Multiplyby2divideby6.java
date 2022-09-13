package ProblemSolving5;

import java.util.Scanner;

public class Multiplyby2divideby6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int c2 = 0;
            int c3 = 0;
            while (n % 2 == 0) {
                ++c2;
                n /= 2;
            }
            while (n % 3 == 0) {
                ++c3;
                n /= 3;
            }
            System.out.println(c3 + " " + c2);

            int w = Math.min(c2, c3);
            if (c2 <= c3 && n == 1) {
                System.out.println('d');
            } else {
                System.out.println("-1");
            }

        }
    }
}
