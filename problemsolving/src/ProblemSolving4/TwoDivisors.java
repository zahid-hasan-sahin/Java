package ProblemSolving4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TwoDivisors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        int q = scan.nextInt();
        int pr[] = new int[10000010];
        for (int i = 2; i < 10000010; i++) {
            if (pr[i] == 0) {
                for (int j = i; j < 10000010; j += i) {
                    if (pr[j] == 0) {
                        pr[j] = i;
                    }
                }
            }
        }
        while (q-- > 0) {
            int n = scan.nextInt();
            int a = 1;
            int i = n;
            int b = 1;
            HashSet<Integer> e = new HashSet<Integer>();

            long t = 1;
            while (i != 1) {
                e.add(pr[i]);
                t *= pr[i];
                i = i / pr[i];

            }
            ArrayList<Integer> w = new ArrayList<Integer>(e);

            if (w.size() <= 1) {
                a = -1;
                b = -1;
            } else {
                a = w.get(0);
                for (int j = 1; j < w.size(); j++) {
                    b *= w.get(j);
                }
            }
            x.append(a + " ");
            y.append(b + " ");
        }

        System.out.println(x);

        System.out.println(y);

    }

}
