package problemSolving8;

import java.util.Scanner;

public class PaintheArray {

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
            }
            long g = 0;
            for (int i = 0; i < n; i += 2) {
                g = gcd(g, a[i]);
            }
            boolean b = true;
            for (int i = 1; i < n; i += 2) {
                if (a[i] % g == 0) {
                    b = false;
                }
            }
            if (b) {
                System.out.println(g);
                continue k;
            }

            g = 0;
            for (int i = 1; i < n; i += 2) {
                g = gcd(g, a[i]);
            }
            b = true;
            for (int i = 0; i < n; i += 2) {
                if (a[i] % g == 0) {
                    b = false;
                }
            }

            if (b) {
                System.out.println(g);
                continue k;
            }
            System.out.println(0);

        }
    }
}
