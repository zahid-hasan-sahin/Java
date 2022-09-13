package ProblemSolving5;

import java.util.Scanner;

public class Exams {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        double p = k / 2.0;
        p = n - (p - n) * 2;
        System.out.println((int) Math.max(0, Math.min(n,p)));
    }

}
