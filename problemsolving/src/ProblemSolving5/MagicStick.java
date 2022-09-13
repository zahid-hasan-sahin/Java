package ProblemSolving5;

import java.util.Scanner;

public class MagicStick {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a >= b) {
                System.out.println("YES");
            } else if ((a <= 3 && b != 3) || a == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
