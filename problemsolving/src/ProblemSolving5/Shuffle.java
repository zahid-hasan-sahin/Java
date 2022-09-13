package ProblemSolving5;

import java.util.Scanner;

public class Shuffle {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int m = scan.nextInt();
            int a = x;
            int b = x;
            while (m-- > 0) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                if (l <= a && r >= a) {
                    a = Math.min(a, l);
                }
                if (l <= b && r >= b) {
                    b = Math.max(b, r);
                }
            }
            System.out.println(b-a+1);
        }
    }

}
