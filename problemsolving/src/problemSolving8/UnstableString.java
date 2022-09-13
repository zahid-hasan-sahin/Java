package problemSolving8;

import java.util.Scanner;

public class UnstableString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[] pre = new int[n];

            int l = 0;
            int r = 0;
            long res = 0;
            char[] temp = s.toCharArray();
            int p = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) != '?') {
                    p = i;
                } else {
                    pre[p] = i;
                }
            }
            while (r < n) {
                if (r == 0) {
                    ++res;
                    ++r;
                    continue;
                }
                if (s.charAt(r) != '?' && (s.charAt(r) == temp[r - 1] || s.charAt(r) == s.charAt(r - 1))) {

                    if (s.charAt(r - 1) == '?') {
                        l = pre[r];
                    } else {
                        l = r;
                    }

                } else {
                    if (s.charAt(r) == '?') {

                        if (s.charAt(r - 1) == '1' || temp[r - 1] == '1') {
                            temp[r] = '0';
                        } else {
                            temp[r] = '1';
                        }

                    }
                }

                res += (r - l + 1);
               
                ++r;

            }
            System.out.println(res);
        }

    }
}
