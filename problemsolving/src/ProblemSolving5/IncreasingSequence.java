package ProblemSolving5;

import java.util.Scanner;

public class IncreasingSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int res = 0;
        for (int i = 1; i < n; i++) {
            int in = scan.nextInt();
            int k = p - in;
            int t = 0;
            if (k >= 0) {             
                t = (int) Math.ceil((k + 1) / (double) d);
                
                res += t;
            }
            p = in + (t * d);
        }
        System.out.println(res);

    }

}
