package NumberTheory;

import java.util.Scanner;

public class GcdSum {

    static int mx = 1000010;
    static long phi[] = new long[mx];

    static long getCount(int n, int d) {
        
        return phi[n / d];

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < mx; i++) {
            phi[i] = i;
        }
        for (int i = 2; i < mx; i++) {
            if (phi[i] == i) {
                for (int j = i; j < mx; j += i) {
                    phi[j] = phi[j] / i;
                    phi[j] = phi[j] * (i - 1);
                }
            }
        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int res = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    int d1 = i;
                    int d2 = n / i;
                    res += d1 * getCount(n, d1);
                    if (d1 != d2) {
                        res += d2 * getCount(n, d2);
                    }
                }
            }
            System.out.println(res);
        }
    }

}
