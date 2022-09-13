package ProblemSolving5;

import java.util.Scanner;

public class PuzzlePieces {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == m && n == 2) {
                System.out.println("YES");
            } else if (n == 1 || m == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
