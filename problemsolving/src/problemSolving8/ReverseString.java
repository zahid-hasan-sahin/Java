package problemSolving8;

import java.util.Scanner;

public class ReverseString {

    static boolean isPos(String s, String a, int n, int m, boolean isRight) {

        if (m == a.length()) {
            return true;
        }
        if (s.length() == n) {
            return isPos(s, a, n - 2, m, false);
        }
        if (n == -1) {
            if (m == a.length()) {
                return true;
            } else {

                return false;
            }
        }
        if (n != - 1 && n != s.length()) {
            if (s.charAt(n) != a.charAt(m)) {
                return false;
            }
        }

        if (isRight) {
            boolean k = isPos(s, a, n + 1, m + 1, true);
            if (k) {
                return true;
            }
            k = isPos(s, a, n - 1, m + 1, false);
            if (k) {
                return true;
            }
            return false;
        } else {
            return isPos(s, a, n - 1, m + 1, false);
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            String s = scan.next();
            String a = scan.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == a.charAt(0)) {
                    boolean isRight = true;
                    boolean r = isPos(s, a, i, 0, isRight);
                    if (r) {
                        System.out.println("YES");
                        continue k;
                    }
                }
            }
            System.out.println("NO");
        }
    }
}
