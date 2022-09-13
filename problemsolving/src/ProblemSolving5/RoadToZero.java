package ProblemSolving5;

import java.util.Scanner;

public class RoadToZero {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextInt();
            int b = scan.nextInt();
            long x = scan.nextInt();
            int y = scan.nextInt();
            if (x * 2 > y) {
                long p = Math.abs(a - b) * x;
                System.out.println(p + (Math.min(a, b) * y));
            } else {
                System.out.println((a + b) * x);
            }

        }
    }

}
