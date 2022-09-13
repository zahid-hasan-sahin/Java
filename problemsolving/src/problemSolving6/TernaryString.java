package problemSolving6;

import java.util.Scanner;

public class TernaryString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[] a = new int[4];
            int i = 0;
            int j = 0;
            int res = 1000000000;
            while (i < n && j < n) {
                ++a[s.charAt(j) - '0'];

                if (a[1] >= 1 && a[2] >= 1 && a[3] >= 1) {

                    while (i < n && a[1] >= 1 && a[2] >= 1 && a[3] >= 1) {
                        --a[s.charAt(i) - '0'];
                        if (a[s.charAt(i) - '0'] == 0) {
                            ++a[s.charAt(i) - '0'];
                            break;
                        }
                        ++i;
                    }

                    res = Math.min(res, (j - i + 1));
                }
                ++j;
            }
            if (res == 1000000000) {
                System.out.println("0");
            } else {
                System.out.println(res);
            }
        }
    }
}
