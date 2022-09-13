package problemSolving2;

import java.util.Scanner;

public class NewClass11 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a > 4) {
                a = a - 4;
            }
            if (b > 4) {
                b = b - 4;
            }
            if (c > 4) {
                c = c - 4;
            }
            int r = Math.min(a, Math.min(b, c)) == 4 ? 5 : Math.min(a, Math.min(b, c));
            System.out.println((a + b + c) -r);
        }

    }

}
