package problemSolving8;

import java.util.Scanner;

public class RobotontheBoard1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            String s = scan.next();
            int k = b;
            int mnk = b;
            int mxk = 0;
            int res = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    --k;
                } else if (s.charAt(i) == 'L') {
                    ++k;
                }
                mnk = Math.min(mnk, k);
                mxk = Math.max(mxk, k);
                System.out.println(mnk + " " + mxk + " " + k);
                if (mxk - mnk >= k) {
                    System.out.println('K');
                    break;
                } else {
                    res = k - mnk + 1;

                }

            }
            System.out.println(res);
        }
    }
}
