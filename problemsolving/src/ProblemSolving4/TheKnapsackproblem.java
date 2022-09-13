package ProblemSolving4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TheKnapsackproblem {

    public static class st {

        double w, p, b;

    }

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            double f = ob1.b;
            double l = ob2.b;
            return f < l ? 1 : -1;

        }

    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        TheKnapsackproblem.st[] ob = new TheKnapsackproblem.st[n];
        for (int i = 0; i < n; i++) {
            int w = scan.nextInt();
            double p = scan.nextDouble();
            ob[i] = new st();
            ob[i].w = w;
            ob[i].p = p;
            ob[i].b = p / w;
        }
        
        Arrays.sort(ob, new myCom());      
        int i = 0;
        int r = 0;
        int w = 0;
        for (i = 0; i < n; i++) {
            if (ob[i].w + w <= k) {
                int u = k /(int)ob[i].w;
                r += (u * ob[i].p);
                w += (ob[i].w * u);
            } else {
                break;
            }
        }
        System.out.println(r);
    }

}
