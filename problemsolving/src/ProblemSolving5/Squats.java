package ProblemSolving5;

import java.util.Scanner;

public class Squats {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int t = 0, d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                ++t;
            } else {
                ++d;
            }
        }
        if (t > d) {
            int p = (t - d) / 2;
            System.out.println(p);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'X' && p > 0) {
                    System.out.print('x');
                    --p;
                } else {
                    System.out.print(s.charAt(i));
                }
            }
        } else {
            int p = (d - t) / 2;
            System.out.println(p);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'x' && p > 0) {
                    System.out.print('X');
                    --p;
                } else {
                    System.out.print(s.charAt(i));
                }
            }
        }
        System.out.println();

    }
}
