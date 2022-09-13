package ProblemSolving5;

import java.util.Scanner;

public class SpecialPermutation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                for (int i = n; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            } else {
                int k = n / 2 + 1;
                for (int i = n; i >= 2; i--) {
                    if (k == i) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
                System.out.print(k);

            }
            System.out.println();
        }

    }
}
