package problemSolving2;

import java.util.Scanner;

public class CountSubrectangles {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int l = 0, r = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                ++l;
            } else {
                ++r;
            }
        }
        if (l == r) {
            l = 0;
            r = 0;
            int temp = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                while (s.charAt(i) == ')') {
                    ++r;
                    ++i;
                    if (i >= n) {
                        break;
                    }
                }
                while (s.charAt(i) == '(') {
                    ++l;
                    ++i;
                    if (i >= n) {
                        break;
                    }
                }
                if (l > r) {
                    l = l - r;
                    res += r + l;
                    r = r - l;

                }
            }
            System.out.println(res * 2);

        } else {
            System.out.println(-1);
        }
    }
}
