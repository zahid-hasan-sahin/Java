package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1560 {

    static int lcs(String a, String b, int n, int m) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (c == m) {
                break;
            }
            if (a.charAt(i) == b.charAt(c)) {
                ++c;
            }
        }

        int count = n - c;
        for (int i = c; i < m; i++) {
            ++count;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int res = 100000000;
            for (int i = 0; i < 63; i++) {
                String com = String.valueOf((long) Math.pow(2, i));
                int x = lcs(s, com, s.length(), com.length());

                res = Math.min(res, x);

            }
            System.out.println(res);

        }
    }
}
