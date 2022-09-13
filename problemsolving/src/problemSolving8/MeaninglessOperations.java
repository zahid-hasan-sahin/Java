package problemSolving8;

import java.util.Scanner;

public class MeaninglessOperations {

    static int gcd(int a, int b) {
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] dp = new int[33554450];
        dp[3] = 1;
        dp[7] = 1;
        dp[15] = 5;
        dp[31] = 1;
        dp[63] = 21;
        dp[127] = 1;
        dp[255] = 85;
        dp[511] = 73;
        dp[1023] = 341;
        dp[2047] = 89;
        dp[4095] = 1365;
        dp[8191] = 1;
        dp[16383] = 5461;
        dp[32767] = 4681;
        dp[65535] = 21845;
        dp[131071] = 1;
        dp[262143] = 87381;
        dp[524287] = 1;
        dp[1048575] = 349525;
        dp[2097151] = 299593;
        dp[4194303] = 1398101;
        dp[8388607] = 178481;
        dp[16777215] = 5592405;
        dp[33554431] = 1082401;

        int q = scan.nextInt();
        while (q-- > 0) {
            int in = scan.nextInt();
            int lg = 0;
            while (Math.pow(2, lg) <= in) {
                ++lg;
            }
            if (Math.pow(2, lg) == in + 1) {
                System.out.println(dp[in]);
            } else {
                System.out.println((int) Math.pow(2, lg) - 1);
            }
        }

    }
}
