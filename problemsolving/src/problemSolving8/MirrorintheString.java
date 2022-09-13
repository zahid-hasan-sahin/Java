package problemSolving8;

import java.util.Scanner;

public class MirrorintheString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            s += "}";
            int k = 0;
            boolean ch = true;
            StringBuilder r = new StringBuilder(s);
            r.append(s.charAt(0));
            while (k < n) {
                if (r.charAt(r.length() - 1) != s.charAt(k)) {
                    ch = false;
                }
                if (s.charAt(k) <= s.charAt(k + 1)) {
                    if (s.charAt(k) != s.charAt(k + 1) || ch) {
                        break;
                    }

                }
                ++k;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= k; i++) {
                sb.append(s.charAt(i));
            }
            for (int i = k; i >= 0; i--) {

                sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }

    }

}
