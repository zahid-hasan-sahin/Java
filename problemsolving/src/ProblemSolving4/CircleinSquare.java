package ProblemSolving4;

import java.util.Scanner;

public class CircleinSquare {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1, q;

        q = scan.nextInt();
        while (q-- > 0) {
            System.out.print("Case "+t+": ");
            double n = scan.nextDouble();
            double a_c = Math.PI * n * n;
            System.out.printf("%.2f",((n + n) * (n + n)) - a_c);
            System.out.println();
            ++t;

        }
    }

}
