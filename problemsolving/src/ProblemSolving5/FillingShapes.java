package ProblemSolving5;

import java.util.Scanner;

public class FillingShapes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 1) {
            System.out.println(0);
        } else {
             n /=2;
            System.out.println((long)Math.pow(2,n));
        }
    }
}
