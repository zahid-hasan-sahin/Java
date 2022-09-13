package problemSolving8;

import java.util.Scanner;

public class cfContest1634 {

    static boolean isPal(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            --r;
            ++l;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            if (k == 0) {
                System.out.println(1);
            } else if (isPal(s)) {
                System.out.println(1);
            } else {

                System.out.println(2);
            }
        }
    }
}
