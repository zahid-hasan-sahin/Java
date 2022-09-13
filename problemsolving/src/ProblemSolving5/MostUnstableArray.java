package ProblemSolving5;

import java.util.Scanner;

public class MostUnstableArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(m);

            } else {
                System.out.println(2 * m);
            }
        }
    }

}
