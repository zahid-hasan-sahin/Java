package ProblemSolving5;

import java.util.Scanner;

public class IchihimeandTriangle {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println(Math.max(a, b) + " " + Math.max(b, c) + " " + Math.min(c, d));
        }
    }
}
