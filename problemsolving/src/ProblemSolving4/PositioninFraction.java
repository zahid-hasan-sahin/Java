package ProblemSolving4;

import java.util.Scanner;

public class PositioninFraction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        String s = String.valueOf(a / b);
        int k = -1;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == 'c') {
                k = i + 1;
            }
        }
        System.out.println(k);
    }

}
