package lightOj;

import java.util.Scanner;

public class TrailingZeroes {

    static long fact(int a, int b) {
        long res = 0;
        while (a / b >= 1) {
            res += a / b;
            a = a / b;
        }
        return res;
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();
        int t = 1;
        int n, r, p, q, p2, p5;
        long x, y;
        while (w-- > 0) {
            n = scan.nextInt();
            r = scan.nextInt();
            p = scan.nextInt();
            q = scan.nextInt();
            p2 = 0;
            p5 = 0;
            while (p % 5 == 0 && p != 0) {
                ++p5;
                p = p / 5;
            }
            while (p % 2 == 0 && p != 0) {
                ++p2;
                p /= 2;
            }

            x = (fact(n, 2) - (fact(r, 2) + fact(n - r, 2))) + (p2 * q);
            y = (fact(n, 5) - (fact(r, 5) + fact(n - r, 5))) + (p5 * q);
            System.out.print("Case " + t++ + ": ");
            System.out.println(Math.min(x, y));
        }
    }

}
