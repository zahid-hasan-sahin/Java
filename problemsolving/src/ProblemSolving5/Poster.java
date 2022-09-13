package ProblemSolving5;

import java.util.Scanner;

public class Poster {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String s = scan.next();
        if (m > n - m) {
            while (m != n) {
                System.out.println("RIGHT");
                ++m;
            }
            for (int i = m - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println("PRINT " + s.charAt(i));
                } else {
                    System.out.println("PRINT " + s.charAt(i));
                    System.out.println("LEFT");
                }
            }
        } else {
            while (m != 1) {
                System.out.println("LEFT");
                --m;
            }
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    System.out.println("PRINT " + s.charAt(i));
                } else {
                    System.out.println("PRINT " + s.charAt(i));
                    System.out.println("RIGHT");
                }
            }

        }
    }

}
