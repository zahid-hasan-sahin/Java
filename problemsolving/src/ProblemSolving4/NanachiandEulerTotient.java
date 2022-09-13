package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class NanachiandEulerTotient {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        ArrayList<Long> div = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                div.add(i);
                if (n / i != i) {
                    div.add(n / i);
                }
            }
        }
        int mod = 1000000007;
        long res = 1;
        for (int i = 0; i < div.size(); i++) {
            long k = div.get(i);
            long t = k;
            for (long j = 2; j * j <= k; j++) {
                if (k % j == 0) {
                    while (k % j == 0) {
                        k = k / j;
                    }
                    t = t / j;
                    t *= (j - 1);
                }
            }
            if (k > 1) {
                t = t / k;
                t *= (k - 1);
            }

            res = ((t % mod) * (res % mod)) % mod;
        }
        System.out.println(res);

    }
}
