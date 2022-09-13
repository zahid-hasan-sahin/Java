package problemSolving6;

import java.util.Scanner;

public class WackyWorkouts {

    static long mod = 1000000007;

    static void mul(long[][] res, long[][] m) {
        long[][] t = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                t[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    t[i][j] += ((res[i][k] % mod) * (m[k][j] % mod)) % mod;
                    t[i][j] %= mod;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = t[i][j];
            }
        }
    }

    static long[][] pow(long[][] m, long n) {
        long[][] id = new long[2][2];
        id[0][0] = id[1][1] = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                mul(id, m);
                --n;
            }
            mul(m, m);
            n = n / 2;
        }
        return id;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long[][] m = new long[2][2];
            m[0][0] = 0;
            m[0][1] = m[1][0] = m[1][1] = 1;
            m = pow(m, n);
            System.out.println((m[1][0] + m[1][1]) % mod);
        }
    }

}
