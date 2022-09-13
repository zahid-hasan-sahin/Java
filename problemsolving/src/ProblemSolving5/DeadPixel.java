package ProblemSolving5;

import java.util.Scanner;

public class DeadPixel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int r1 = b * x;
            int r2 = a * y;
            int r3 = (a - x - 1) * b;
            int r4 = (b - y - 1) * a;
            System.out.println(Math.max(r1,Math.max(r2,Math.max(r3,r4))));
        }

    }

}
