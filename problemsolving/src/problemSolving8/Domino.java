package problemSolving8;

import java.util.Scanner;

public class Domino {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            boolean ch = true;
            int a = n;
            int b = m / 2 * 2;
            if (k <= (a * b / 2) && Math.abs(k - (a * b / 2)) % 2 == 0) {

            } else {
                ch = false;
            }

            a = n / 2 * 2;
            b = m;
            k = (n * m) / 2 - k;
            if (k <= (a / 2 * b) && Math.abs(k - (a / 2 * b)) % 2 == 0) {
            } else {
                ch = false;
            }
            if (ch) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
