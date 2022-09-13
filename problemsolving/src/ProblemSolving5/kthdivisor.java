package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kthdivisor {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int k = scan.nextInt();
        int t = (int) Math.sqrt(n);
        ArrayList<Long> a = new ArrayList<Long>();
        for (long i = 1; i <= t; i++) {
            if (n % i == 0) {
                a.add(i);
                if (n / i != i) {
                    a.add((n / i));
                }
            }
        }
        
        Collections.sort(a);
        if (k > a.size()) {
            System.out.println("-1");
        } else {
            System.out.println(a.get(k - 1));
        }
    }

}
