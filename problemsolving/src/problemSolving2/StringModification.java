package problemSolving2;

import java.util.Scanner;

public class StringModification {

    static public String rev(String s) {

        char[] try1 = s.toCharArray();
        String r = "";
        for (int i = try1.length - 1; i >= 0; i--) {
            r += try1[i];
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            char mn = 'z';
            int c = 0;
            char w = s.charAt(0);
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) < mn) {
                    mn = s.charAt(i);
                }
                if (w == s.charAt(i)) {
                    ++c;
                }
            }
            String u = s;
            int e = 1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == mn) {
                    if (n % (i + 1) == 0 && n != i + 1) {
                        String te = (s.substring(i) + s.substring(0, i));
                        if (te.compareTo(u) < 1) {
                            u = te;
                            e = i + 1;
                        }
                    } else {
                        String r = rev(s.substring(0, i));
                        String te = (s.substring(i) + r);

                        if (te.compareTo(u) < 1) {
                            u = te;
                            e = i + 1;
                        }
                    }
                }
            }
            sb.append(u + "\n");
            sb.append(c == n ? 1 + "\n" : e + "\n");

        }
        System.out.println(sb);

    }
}
