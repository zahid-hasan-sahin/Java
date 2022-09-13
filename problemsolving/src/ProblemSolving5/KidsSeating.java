package ProblemSolving5;

import java.util.Scanner;

public class KidsSeating {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = n * 4;
            while (n != 0) {
                --n;
                System.out.print(a + " ");
                a -= 2;
            }
            System.out.println();
        }
    }

}
