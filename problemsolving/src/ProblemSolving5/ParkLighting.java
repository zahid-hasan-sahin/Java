package ProblemSolving5;

import java.util.Scanner;

public class ParkLighting {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println((int) Math.ceil(n * m / 2.0));
        }
    }

}
