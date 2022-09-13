package NumberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ModularGCD {

    public static long pow(long a, long c, long n) {

        long res = 1;
        while (c != 0) {
            if (c % 2 == 1) {
                res = ((res % n) * (a % n)) % n;
                --c;
            }
            a = ((a % n) * (a % n)) % n;

            c = c / 2;

        }
        return res;
    }

    public static long mod(long a, long b, long c, long n) {
        long t1 = pow(a, c, n);
        long t2 = pow(b, c, n);
        return ((t1 % n) + (t2 % n)) % n;
    }

    public static void findDiv(ArrayList<Long> arra, long n) {

        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                arra.add(i);
                if (n / i != i) {
                    arra.add(n / i);
                }
            }
        }
        Collections.sort(arra, Collections.reverseOrder());
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            ArrayList<Long> div = new ArrayList<Long>();
            findDiv(div, (a - b));
            long k = div.size();
            long r = -1;
            for (int i = 0; i < k; i++) {
                if (mod(a, b, c, div.get(i)) == 0) {
                    r = (div.get(i));
                    break;
                }
            }
            if (r == -1) {
                System.out.println(mod(a, b, c,1000000007 ) );
            } else {
                System.out.println(r % 1000000007);
            }
        }
    }

}
