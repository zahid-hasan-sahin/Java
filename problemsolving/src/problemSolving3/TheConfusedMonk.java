package problemSolving3;

import java.util.Scanner;

public class TheConfusedMonk {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    static long pow(long a, int n) {
        long res = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                res = ((res % 1000000007) * (a % 1000000007)) % 1000000007;
                --n;
            }
            a = ((a % 1000000007) * (a % 1000000007)) % 1000000007;
            n = n / 2;

        }
        return res % 1000000007;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int t = 0;
        long p = 1;
        for (int i = 0; i < n; i++) {
            t = gcd(t, a[i]);
            p = ((p % 1000000007) * (a[i] % 1000000007)) % 1000000007;
        }
        System.out.println(pow(p, t));

    }

}
