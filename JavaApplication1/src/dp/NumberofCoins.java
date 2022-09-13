package dp;

import java.util.Arrays;
import java.util.Scanner;

public class NumberofCoins {

    static int[] dp = new int[10010];

    
    
    static int usingBottumTop(int[] a, int n, int k) {

        int[] dp = new int[k + 1];
        for (int i = 1; i < k + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int j = a[i]; j <= k; j++) {
                if (dp[j - a[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], 1 + dp[j - a[i]]);
                }
            }
        }
        if (dp[k] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[k];
    }
    
    

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int k = s + 1;
        int[] dp = new int[k];
        for (int i = 0; i < k; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i < k; i++) {
            int mn = Integer.MAX_VALUE;
            for (int j = 0; j < n && a[j] <= i; j++) {
                mn = Math.min(dp[i - a[j]], mn);
            }
            if (mn != Integer.MAX_VALUE) {
                dp[i] = mn + 1;
            }
        }
        if (dp[s] == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(dp[s]);
        }
    }
}
