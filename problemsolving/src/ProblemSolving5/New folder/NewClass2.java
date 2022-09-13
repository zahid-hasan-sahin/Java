package ProblemSolving5;

import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.charAt(i) - '0';
            }
            int k = scan.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    if (i - k >= 0) {
                        b[i - k] = 0;
                    }
                    if (i + k < n) {
                        b[i + k] = 0;
                    }
                }

            }

            boolean ch = true;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1 && (i < k || b[i - k] == 0) && (i + k >= n || b[i + k] == 0)) {
                    ch = false;
                }
            }
            if (ch) {
                for (int i = 0; i < n; i++) {
                    System.out.print(b[i]);
                }
                System.out.println();

            } else {
                System.out.println("-1");
            }

        }
    }
}
