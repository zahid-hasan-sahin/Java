package problemSolving8;

import java.util.Scanner;

public class cfContest1623 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int x = 1111111111;
            int y = 1111111111;
            if (x2 >= x1) {
                x = x2 - x1;
            }
            if (y2 >= y1) {
                y = y2 - y1;
            }
            if (x != 1111111111 || y != 1111111111) {
                System.out.println(Math.min(x, y));
            } else {
                x = (n-x1)
            }

        }
    }
}
