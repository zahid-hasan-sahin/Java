package problemSolving8;

import java.util.Scanner;

public class Penalty {

    static int cal(String s, int n, int f, int l, int df, int dl) {
        if (n == 10) {
            return 10;
        }
        if (f > (l + (5 - dl))) {
            return n;
        }
        if (l > (f + (5 - df))) {
            return n;
        }
        int min = 100;
        if (n % 2 == 0) {
            if (s.charAt(n) == '1') {
                min = Math.min(min, cal(s, n + 1, f + 1, l, df + 1, dl));
            } else if (s.charAt(n) == '0') {
                min = Math.min(min, cal(s, n + 1, f, l, df + 1, dl));
            } else {
                min = Math.min(min, cal(s, n + 1, f + 1, l, df + 1, dl));
                min = Math.min(min, cal(s, n + 1, f, l, df + 1, dl));
            }
        } else {
            if (s.charAt(n) == '1') {
                min = Math.min(min, cal(s, n + 1, f, l + 1, df, dl + 1));
            } else if (s.charAt(n) == '0') {
                min = Math.min(min, cal(s, n + 1, f, l, df, dl + 1));
            } else {
                min = Math.min(min, cal(s, n + 1, f, l, df, dl + 1));
                min = Math.min(min, cal(s, n + 1, f, l + 1, df, dl + 1));
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();

            int f = 0;
            int l = 0;
            int x = cal(s, 0, f, l, 0, 0);
            System.out.println(x);
        }
    }
}
