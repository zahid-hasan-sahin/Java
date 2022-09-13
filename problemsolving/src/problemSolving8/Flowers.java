package problemSolving8;

import java.util.Scanner;
import java.util.Stack;

public class Flowers implements Runnable {

    static int k;
    static int mod = 1000000007;
    static long[] dp = new long[100010];

    static long rec(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n] % mod;
        }
        long a = rec(n - k) % mod;
        long b = rec(n - 1) % mod;
        return dp[n] = (a + b) % mod;
    }

    public static void main(String[] args) throws Exception {
        new Thread(null, new Flowers(), "Main", 1 << 26).start();
    }

    public void run() {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k = scan.nextInt();
        for (int i = 0; i < 100010; i++) {
            dp[i] = -1;
        }
        rec(100005);
        long[] res = new long[100001];
        for (int i = 1; i < 100001; i++) {
            res[i] = ((res[i - 1] % mod) + (dp[i] % mod)) % mod;
        }
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            System.out.println((res[r] - res[l - 1] + mod) % mod);
        }
    }

}
