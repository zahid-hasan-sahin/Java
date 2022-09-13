package dp;

import java.util.Scanner;

public class EditDistance {

    static int[][] dp = new int[110][110];

    static int cal(String a, String b, int n, int m, int r) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (a.charAt(n - 1) != b.charAt(m - 1)) {
            if (dp[n - 1][m] == 0) {
                dp[n - 1][m] = cal(a, b, n - 1, m, r);
            }
            if (dp[n - 1][m - 1] == 0) {
                dp[n - 1][m - 1] = cal(a, b, n - 1, m - 1, r);
            }
            if (dp[n][m - 1] == 0) {
                dp[n][m - 1] = cal(a, b, n, m - 1, r);
            }
            return 1 + Math.min(dp[n - 1][m], Math.min(dp[n - 1][m - 1], dp[n][m - 1]));

        } else {
            if (dp[n - 1][m - 1] == 0) {
                dp[n - 1][m - 1] = cal(a, b, n - 1, m - 1, r);
            }
            return dp[n - 1][m - 1];
        }

    }

    
    
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            String a = scan.next();
            String b = scan.next();
            int[][] arr = new int[n + 1][m + 1];
            for (int i = 0; i <= m; i++) {
                arr[0][i] = i;
            }
            for (int i = 0; i <= n; i++) {
                arr[i][0] = i;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        arr[i][j] = arr[i - 1][j - 1];
                    } else {
                        arr[i][j] = Math.min(arr[i - 1][j], Math.min(arr[i - 1][j - 1], arr[i][j - 1])) + 1;
                    }
                }
            }
            System.out.println(arr[n][m]);
        }
    }
}
