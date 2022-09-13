package ProblemSolving5;

import java.util.Scanner;

public class PairofToys {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        if (n >= k) {
            System.out.println(k / 2);
        }
    }

}
