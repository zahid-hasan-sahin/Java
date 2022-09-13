package problemSolving8;

import java.util.Scanner;

public class RGBSubstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            String p = "RGB";
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                int[] com = new int[n];
                for (int j = 0; j < n; j++) {
                    if (p.charAt((i + j) % 3) != s.charAt(j)) {
                        com[j] = 1;
                    }
                }
                int[] pre = new int[n + 1];
                for (int j = 1; j <= n; j++) {
                    pre[j] = pre[j - 1] + com[j - 1];
                }
                for (int j = 1; j <= n - (k - 1); j++) {
                    res = Math.min(res, pre[j + k - 1] - pre[j - 1]);
                }
            }
            System.out.println(res);
        }
    }

}
