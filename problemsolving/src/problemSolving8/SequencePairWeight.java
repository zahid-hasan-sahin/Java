package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;

public class SequencePairWeight {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long[] dp = new long[n];
            long res = 0;
            HashMap<Long, Long> h = new HashMap<Long, Long>();
            h.put(a[0], (long) 1);
            for (int i = 1; i < n; i++) {
                dp[i] = dp[i - 1] + (h.getOrDefault(a[i], (long) 0));
                h.put(a[i], h.getOrDefault(a[i], (long) 0) + (i + 1));
                res += dp[i];
            }
            System.out.println(res);
        }
    }

}
