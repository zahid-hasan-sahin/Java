package ProblemSolving7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SumofCubes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        HashSet<Long> h = new HashSet<Long>();
        for (long i = 1; i < 10010; i++) {
            h.add(i * i * i);
        }
        k:
        while (t-- > 0) {
            long n = scan.nextLong();
            for (long i : h) {
                long p = n - i;
                if (h.contains(p)) {
                    System.out.println("YES");
                    continue k;
                }
            }
            System.out.println("NO");
        }

    }

}
