package ProblemSolving5;

import java.util.Scanner;

public class DistanceandAxis {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int k = scan.nextInt();
            int p = k - a;
            if (a < k) {
                System.out.println(Math.abs(p));
            } else if (a % 2 == k % 2) {
                System.out.println("0");
            } else {
                System.out.println(1);
            }
        }
    }
}
