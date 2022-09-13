package problemSolving8;

import java.util.Scanner;

public class MaximumSumofProducts {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            b[i] = scan.nextInt();
        }
        long[] nor = new long[n + 2];
        long[] rev = new long[n + 2];
        for (int i = 1; i < n; i++) {
            nor[i] = nor[i - 1] + (a[i] * b[i]);
        }
        int p = n;
        for (int i = 1; i <= n; i++) {
            rev[i] = rev[i - 1] + a[p--] * b[i];
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(nor[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print(rev[i] + " ");
        }
        for (int i = 1; i <= n; i++) {
            long r = 0;
            int ind = i;
            for (int j = i; j <= n; j++) {

            }
        }

    }
}
