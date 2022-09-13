package problemSolving6;

import java.util.Scanner;

public class DirectionalMove {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int c = 0;
            String[] a = {"E", "S", "W", "N"};
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    ++c;
                } else {
                    --c;
                }
                if (c == -1) {
                    c = 3;
                }
                if (c == 4) {
                    c = 0;
                }
            }
            System.out.println(a[c]);

        }

    }
}
