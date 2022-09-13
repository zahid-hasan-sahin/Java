package problemSolving6;

import java.util.Scanner;

public class TernaryStringbn {

    static boolean val(String s, int m) {
        int n = s.length();
        int[] a = new int[4];
        for (int i = 0; i < m - 1; i++) {
            ++a[s.charAt(i) - '0'];
        }

        for (int i = m - 1; i < n; i++) {
            ++a[s.charAt(i) - '0'];
            if (a[1] > 0 && a[2] > 0 && a[3] > 0) {
                return true;
            }
            --a[s.charAt(i - m+1) - '0'];
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int l = 3;
            int r = n;
            int res = 100000000;
            while (l <= r) {
                int m = (l + r) / 2;

                if (val(s, m)) {
                    r = m - 1;
                    res = Math.min(res, m);
                } else {
                    l = m + 1;
                }
            }
            if (res == 100000000) {
                System.out.println("0");
            } else {
                System.out.println(res);
            }
        }
    }

}
