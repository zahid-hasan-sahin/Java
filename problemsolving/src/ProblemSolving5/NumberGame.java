package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = (int) Math.sqrt(n);
            int p = n;
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 2; i <= k; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n = n / i;
                        a.add(i);
                    }
                }
            }
            if (n >= 2) {
                a.add(p);
            }
            Collections.sort(a);
            if (p % 2 == 1 && p != 1) {
                System.out.println("Ashishgup");
                continue;
            }
            int r = a.lastIndexOf(2);

            if ((r == 0 && a.size() == 2) || (r + 1 == a.size()) && a.size() != 1) {
                System.out.println("FastestFinger");
                continue;
            }
            System.out.println("Ashishgup");
        }
    }

}
