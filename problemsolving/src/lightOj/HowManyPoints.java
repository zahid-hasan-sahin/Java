package lightOj;

import java.util.Scanner;

public class HowManyPoints {

    public static long gcd(long a, long b) {

        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long x1 = scan.nextLong();
            long y1 = scan.nextLong();
            long x2 = scan.nextLong();
            long y2 = scan.nextLong();

            System.out.print("Case " + t++ + ": ");
            System.out.println(gcd((long) Math.abs(x2 - x1), (long) Math.abs(y2 - y1)) + 1);
        }

    }
}
