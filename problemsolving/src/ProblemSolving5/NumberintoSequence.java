package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberintoSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            int[] a = new int[(int) Math.sqrt(n) + 2];
            for (long i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    ++a[(int) i];
                    n = n / i;
                }
            }

            ArrayList<Long> ar = new ArrayList<Long>();
            ar.add((long) 1);
            ArrayList<Integer> k = new ArrayList<Integer>();
            a:
            for (long i = 2; i * i <= n; i++) {
                if (a[(int) i] >= 1) {
                    k.add(a[(int) i]);
                    ar.add(ar.get(ar.size() - 1) * i);
                    int[] tr = new int[k.size()];
                    for (int j = 0; j < k.size(); j++) {
                        tr[j] = k.get(j);
                    }
                    k.removeAll(k);
                    for (int j = 0; j < k.size(); j++) {
                        k.add(tr[j] - 1);
                        if (k.get(j) == 1) {
                            break a;
                        }
                    }
                }
            }
            
            for (long i = 2; i * i <= n; i++) {

            }
        }
    }

}
