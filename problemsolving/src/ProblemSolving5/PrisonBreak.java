package ProblemSolving5;

import java.util.Scanner;

public class PrisonBreak {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int res = Math.max(c-1,a-c)+Math.max(d-1, b-d);
            System.out.println(res);
        }
    }
}
