package problemSolving6;

import java.util.Scanner;

public class SansaandXOR {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long res = 0;
            for (int i = 1; i <= n; i++) {
                long k = (long) i * (n - i + 1);
                if (k % 2 == 1) {
                    res ^= a[i - 1];
                }
            }
            System.out.println(res);
        }

    }
}
