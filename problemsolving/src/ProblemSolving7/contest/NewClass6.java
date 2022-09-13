package ProblemSolving7;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long x = scan.nextLong();
            long k = (int) Math.ceil(x / (double) n);
            long p = x%n;
            if (p == 0) {
                p = 3;
            }
            
            long r = m * (p - 1)+k;
            System.out.println(r);
            
        }

    }

}
