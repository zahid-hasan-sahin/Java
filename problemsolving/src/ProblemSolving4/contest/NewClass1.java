package ProblemSolving4;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            long t = 0;
            long res = 0;
            res = Math.abs(a - b);
            t = Math.min(a - res, b - res);
            
            res += (t / 3);
            System.out.println(res);
        }
    }
}
