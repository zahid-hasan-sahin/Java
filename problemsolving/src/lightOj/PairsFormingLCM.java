package lightOj;

import java.util.Scanner;

public class PairsFormingLCM {

    static int max = 10000005;
    static int[] pr = new int[max];
    static int p = 0;

    static void si() {
        pr[0] = pr[1] = 1;
        for (int i = 2; i < max; i++) {
            if (pr[i] == 0) {
                for (long j = i * (long) i; j < max; j += i) {
                    pr[(int) j] = 1;
                }
            }
        }

        for (int i = 0; i < max; i++) {

            if (pr[i] == 0) {
                pr[p++] = i;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        si();
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long res = 1;
            long n = scan.nextLong();
            for (int i = 0; i < p && pr[i] * pr[i] <= n; i++) {
                int k = pr[i];
                if (n % k == 0) {
                    int c = 0;
                    while (n % k == 0) {
                        n /= k;
                        ++c;
                    }
                    res = res * (c * 2 + 1);

                }
            }
            if (n >= 2) {
                res = res * 3;
            }
            System.out.print("Case " + t++ + ": ");
            System.out.println((res + 1) / 2);
        }
    }

}
