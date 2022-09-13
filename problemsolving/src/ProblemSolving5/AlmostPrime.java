package ProblemSolving5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AlmostPrime {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[3005];
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for (int i = 2; i < 3005; i++) {
            if (a[i] == 0) {
                pr.add(i);
                for (int j = i * i; j < 3005; j += i) {
                    a[j] = 1;
                }
            }
        }
        int c = 0;
        for (int i = 5; i <= n; i++) {
            int t = i;
            int e = 0;
            for (int j = 0; t >= pr.get(j); j++) {
                if (t % pr.get(j) == 0) {
                    ++e;
                    while (t % pr.get(j) == 0) {
                        t /= pr.get(j);
                    }

                }

            }
            if (e == 2) {
              
                ++c;
            }

        }
        System.out.println(c);
    }
}
