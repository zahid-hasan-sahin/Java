package problemSolving6;

import java.util.ArrayList;

public class Password2 {

    static long mod = 1000000007;

    static long[][] dp = new long[100010][11];

    static long rec(int c, int r) {
        if (c == 1) {
            return r;
        }
        if (r == 1) {
            return 1;
        }

        long k = Math.max(
                1 + rec(c - 1, r),
                1 + rec(c - 1, r - 1));
        System.out.println(k);
        return k;
    }

    public static void main(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != '-') {
                    ar.add(s.charAt(i) - '0');
                }
            }

            for (int i = 0; i < ar.size() - 1; i++) {
                if (ar.get(i + 1) < ar.get(i)) {
                    System.out.println("0");
                    continue k;
                }
            }
            s = "1" + s;
            s += "9";
            int i = 0;
            long res = 1;
            while (i < n) {
                while (i < n && s.charAt(i) != '-') {
                    ++i;
                }
                int j = i;
                while (j <= n && s.charAt(j) == '-') {
                    ++j;
                }
                --j;
                int c = j - i + 1;
                int k = s.charAt(j + 1) - s.charAt(i - 1) + 1;
                if (c > 0 && k > 0) {
                    System.out.println(c + " " + k);
                    res = ((res % mod) * (rec(c, k) % mod)) % mod;
                }
                i = j + 1;
            }
            System.out.println(res);
        }

    }
}
