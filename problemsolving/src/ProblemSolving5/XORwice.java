package ProblemSolving5;

import java.util.Scanner;

public class XORwice {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a ^ b);
        }
    }

}
