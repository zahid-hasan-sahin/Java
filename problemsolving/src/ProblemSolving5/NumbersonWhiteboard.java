package ProblemSolving5;

import java.util.Scanner;

public class NumbersonWhiteboard {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println("2");
            long k = n;
            for (int i = n - 1; i > 0; i--) {
                System.out.println(i + " " + k);
                k = (long) Math.ceil((i + k) / 2.0);
            }
        }
    }

}
