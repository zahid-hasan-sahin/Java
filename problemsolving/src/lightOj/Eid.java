package lightOj;

import java.math.BigInteger;
import java.util.Scanner;

public class Eid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        BigInteger[] a = new BigInteger[1005];
        BigInteger k, res;
        while (q-- > 0) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                k = scan.nextBigInteger();
                a[i] = k;
            }
            res = a[0];
            for (int i = 1; i < n; i++) {
                res = res.multiply(a[i]).divide(res.gcd(a[i]));
            }
            System.out.print("Case " + t++ + ": ");
            System.out.println(res);
            System.gc();
        }
    }
}
