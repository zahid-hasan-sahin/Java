package problemSolving6;

import java.util.Scanner;

public class SuffixOperations {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long[] cost = new long[n];
            long res = 0;
            for (int i = 0; i < n - 1; i++) {
                cost[i] = Math.abs(a[i] - a[i + 1]);
                res += cost[i];

            }
            long k = res;
            for (int i = 0; i < n; i++) {
                long tRes = k;
                if (i == 0) {
                    tRes -= cost[i];
                } else if (i == n - 1) {
                    tRes -= cost[i - 1];
                } else {
                    tRes = (tRes + Math.abs(a[i - 1] - a[i + 1])) - ((cost[i - 1] + cost[i]));
                }
                res = Math.min(res, tRes);
            }
            System.out.println(res);
        }
    }
}
