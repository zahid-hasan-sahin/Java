package problemSolving8;

import java.util.Arrays;
import java.util.Scanner;

public class MissingBigram {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            StringBuilder sb = new StringBuilder();
            String[] s = new String[n];
            for (int i = 0; i < n - 2; i++) {
                String in = scan.next();
                s[i] = in;
            }
            sb.append(s[0].charAt(0));
            for (int i = 0; i < n - 3; i++) {
                if (s[i].charAt(1) == s[i + 1].charAt(0)) {
                    sb.append(s[i].charAt(1));
                } else {
                    sb.append(s[i].charAt(1) + "" + s[i + 1].charAt(0));
                }
            }
            sb.append(s[n - 3].charAt(1));
            if (sb.length() < n) {
                sb.append("a");
            }
            System.out.println(sb);
        }

    }

}
