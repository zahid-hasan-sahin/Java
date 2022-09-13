package problemSolving8;

import java.util.Scanner;

public class YetAnotherCountingProblem {

    static long lcm(long a, long b) {
        long t1 = a;
        long t2 = b;
        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return (t1 * t2) / a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            long q = scan.nextInt();
            long p = Math.max(a, b);
            long lcm = lcm(a, b);

            while (q-- > 0) {
                long l = scan.nextLong() - 1;
                long r = scan.nextLong();
                long res = r - p + 1;
                long e = (r / lcm) - 1;
                res -= (e * p);
                res -= Math.min((r - ((e + 1) * lcm)) + 1, p);

                long res2 = l - p + 1;
                long e2 = (l / lcm) - 1;
                res2 -= (e2 * p);
                res2 -= Math.min((l - ((e2 + 1) * lcm)) + 1, p);
                res -= res2;

                System.out.print(Math.max(0, res) + " ");
            }
            System.out.println();
        }

    }
}
