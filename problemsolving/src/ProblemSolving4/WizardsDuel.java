package ProblemSolving4;

import java.util.Scanner;

public class WizardsDuel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((n * a) / (double) (a + b));
    }

}
