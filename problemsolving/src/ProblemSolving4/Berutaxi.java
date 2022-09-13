package ProblemSolving4;

import java.util.Scanner;

public class Berutaxi {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        double res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();
            double d = Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
            res = Math.min(res, d / k);

        }
        System.out.println(res);
    }

}
