package problemSolving6;

import java.util.Scanner;

public class PointsandaLine {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long a1 = scan.nextInt();
        long b1 = scan.nextInt();
        long a2 = scan.nextInt();
        long b2 = scan.nextInt();
        long q = scan.nextInt();
        long c1, c2, c3;
        c1 = c2 = c3 = 1;
        while (q-- > 0) {
            long a3 = scan.nextInt();
            long b3 = scan.nextInt();
            long r = a1 * b2 * c3 - a1 * b3 * c2 + b1 * c2 * a3 - b1 * c3 * a2 + c1 * a2 * b3 - c1 * a3 * b2;

            if (r < 0) {
                System.out.println("RIGHT");
            } else if (r > 0) {
                System.out.println("LEFT");
            } else {

                if (((a3 >= a1 && a3 <= a2 || (a3 <= a1 && a3 >= a2)) && ((b3 >= b1 && b3 <= b2) || b3 <= b1 && b3 >= b2))) {
                    System.out.println("ON_SEGMENT");
                } else {
                    System.out.println("ON_LINE");
                }
            }

        }

    }

}
