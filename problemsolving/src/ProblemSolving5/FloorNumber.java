package ProblemSolving5;

import java.util.Scanner;

public class FloorNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            double k = Math.ceil((n - 2) / (double) x);
            System.out.println(Math.max((int) k +1, 1));
        }
    }
}
