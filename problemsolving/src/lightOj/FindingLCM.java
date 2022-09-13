package lightOj;

import java.util.Scanner;

public class FindingLCM {

    static long gcd(long a, long b) {

        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        while (q-- > 0) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            long l = scan.nextLong();
            long m = (a * b) / gcd(a, b);
            long p = l / m;
            long k = gcd(m, p);
            System.out.print("Case " + t++ + ": ");
            if (l % m != 0) {
                System.out.println("impossible");
                continue;
            }
            //   System.out.println(m + " " + p + " " + k);
            while (k != 1) {
                p *= k;
                m /= k;
                k = gcd(p, m);
            }
            
            System.out.println(p);
        }
    }

}
