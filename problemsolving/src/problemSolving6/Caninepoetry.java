package problemSolving6;

import java.util.Scanner;

public class Caninepoetry {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int[] a = new int[s.length()];
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    if (a[i] == 0 && a[i + 1] == 0) {
                        a[i + 1] = 1;
                    }
                }
                if (s.charAt(i) == s.charAt(i + 2)) {
                    if (a[i] == 0 && a[i + 2] == 0) {
                        a[i + 2] = 1;
                    }
                }
            }
            int n = s.length();
            if (s.length() > 1) {
                if (s.charAt(n - 1) == s.charAt(n - 2)) {
                    if (a[n - 1] == 0 && a[n - 2] == 0) {
                        a[n - 1] = 1;
                    }
                }
            }
            long res = 0;
            for (int i = 0; i < s.length(); i++) {
                res += a[i];
            }
            System.out.println(res);
        }
    }

}
