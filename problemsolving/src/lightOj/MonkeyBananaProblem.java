package lightOj;

import java.util.Scanner;

public class MonkeyBananaProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    a[i][j] = scan.nextInt();
                }
            }

            int[] temp = new int[n];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int mx = 0;
                    if (j - 1 >= 0) {
                        mx = Math.max(a[i - 1][j - 1], mx);
                    }
                    mx = Math.max(a[i - 1][j], mx);
                    a[i][j] += mx;

                }
            }
            for (int i = 0; i < n; i++) {
                temp[i] = a[n - 1][i];
                System.out.println(temp[i]);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = 0;
                }
            }
            for (int i = 0; i < n; i++) {
                a[0][i] = temp[i];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    long mx = 0;
                    if (j + 1 < n) {
                        mx = Math.max(a[i - 1][j + 1], mx);
                    }
                    mx = Math.max(a[i - 1][j], mx);
                    a[i][j] += mx;

                }
            }
            System.out.print("Case " + q++ + ": ");

            System.out.println(a[n - 1][0]);

        }
    }

}
