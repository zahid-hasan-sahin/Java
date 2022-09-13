package ProblemSolving5;

import java.util.Scanner;

public class WizardsandDemonstration {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int r = (int) Math.ceil(n * k / 100.0);
        System.out.println(Math.max(r-m,0));
    }

}
