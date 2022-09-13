package problemSolving8;

import java.util.Scanner;

public class TwoSubsequences {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int mn = 1000;
            for (int i = 0; i < n; i++) {
                mn = Math.min(mn, s.charAt(i));
            }
            boolean b = true;
            String x = "";
            String y = "";
            for (int i = 0; i < n; i++) {
                if (b && s.charAt(i) == mn) {
                    x += s.charAt(i);
                    b = false;
                } else {
                    y += s.charAt(i);
                }
            }
            System.out.println(x + " " + y);
        }
    }

}
