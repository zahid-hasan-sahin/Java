package ProblemSolving5;

import java.util.Scanner;

public class WastedTime {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        double s = 0;
        double x = scan.nextInt();
        double y = scan.nextInt();
        for (int i = 1; i < n; i++) {
            double a = scan.nextInt();
            double b = scan.nextInt();
            s +=  Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
            x = a;
            y = b;
        }
        System.out.println((s / 50.0)*k);
    }

}
