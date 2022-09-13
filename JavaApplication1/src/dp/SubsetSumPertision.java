package dp;

import java.util.Scanner;

public class SubsetSumPertision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int s = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
            }

            if (s % 2 == 1) {
                System.out.println("NO");
            } else {
                int k = s / 2;
            
                boolean[] dp = new boolean[k + 1];
                dp[0] = true;
                for (int i = 0; i < n; i++) {
                    for (int j = k; j >= a[i]; j--) {
                        dp[j] = dp[j] || dp[j - a[i]];
                    }
                }
               
                if (dp[k]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }

}
