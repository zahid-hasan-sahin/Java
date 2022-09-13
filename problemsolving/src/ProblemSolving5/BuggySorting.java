package ProblemSolving5;

import java.util.Scanner;

public class BuggySorting {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 2) {
            System.out.print(3 + " " + 2 + " " + 1 + " ");
            for (int i = 4; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }
}
