package ProblemSolving5;

import java.util.Scanner;

public class BoxisPull {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (a == x) {
                System.out.println(Math.abs(b - y));
            } else if (b == y) {
                System.out.println(Math.abs(a - x));
            } else {
                System.out.println(Math.abs(x - a) + Math.abs(b - y) + 2);
            }
        }
    }

}
