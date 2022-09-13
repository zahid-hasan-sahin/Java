package problemSolving3;

import java.util.Scanner;


public class CommonDivisors {

    public static long GCD(long a, long b) {

        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);

    }

    static long countDivisors(long n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    cnt++;
                } else {
                    cnt = cnt + 2;
                }
            }
        }
        return cnt;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        for (int i = 1; i < n; i++) {
            long b = scan.nextLong();
            a = GCD(a, b);

        }
        System.out.println(countDivisors(a));

    }

}
