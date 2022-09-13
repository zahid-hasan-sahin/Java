package ProblemSolving5;

import java.util.Scanner;

public class DigitGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = s.charAt(i - 1) - '0';

            }
            if (n % 2 == 0) {
                boolean b = false;
                for (int i = 2; i <= n; i += 2) {
                    if (a[i] % 2 == 0) {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    System.out.println("2");
                } else {
                    System.out.println("1");
                }
            } else {
                boolean b = false;
                for (int i = 1; i <= n; i += 2) {

                    if (a[i] % 2 == 1) {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }

            }
        }
    }

}
