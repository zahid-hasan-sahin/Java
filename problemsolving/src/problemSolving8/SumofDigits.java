package problemSolving8;

import java.util.Scanner;
import java.util.Stack;

public class SumofDigits {

    static long[][][] dp = new long[11][100][2];

    static long getSum(String s, int pos, int sum, int flag, int n) {
        if (pos >= n) {
            return sum;
        }
        if (dp[pos][sum][flag] != -1) {
            return dp[pos][sum][flag];
        }
        int lim = 9;
        if (flag == 0) {
            lim = s.charAt(pos) - '0';
        }
        long res = 0;
        for (int i = 0; i <= lim; i++) {
            if (flag == 1 || i < lim) {
                res += getSum(s, pos + 1, sum + i, 1, n);
            } else {
                res += getSum(s, pos + 1, sum + i, 0, n);
            }
        }
        return dp[pos][sum][flag] = res;
    }

    static int get(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i) - '0';
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String a = scan.next();
            String b = scan.next();
            if (a.equals("-1")) {
                return;
            }
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 100; j++) {
                    for (int k = 0; k < 2; k++) {
                        dp[i][j][k] = -1;
                    }
                }
            }
            long l = getSum(a, 0, 0, 0, a.length());
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 100; j++) {
                    for (int k = 0; k < 2; k++) {
                        dp[i][j][k] = -1;
                    }
                }
            }
            long r = getSum(b, 0, 0, 0, b.length());
            long res = (r - l + get(a));
            System.out.println(res);
        }

    }

}
