package dp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class job_schdul {

    public static class st {

        int s, e, p;

    }

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.e;
            int l = ob2.e;
            return f > l ? 1 : -11;

        }

    }

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            job_schdul.st[] ob = new job_schdul.st[n];
            for (int i = 0; i < n; i++) {
                ob[i] = new st();
                ob[i].s = scan.nextInt();
                ob[i].e = ob[i].s + scan.nextInt();
                ob[i].p = scan.nextInt();
            }
            Arrays.sort(ob, new myCom());
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = ob[i].p;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (ob[i].s >= ob[j].e) {
                        res[i] = Math.max(res[i], res[j] + ob[i].p);
                    }
                }
            }
            long r = 0;
            for (int i = 0; i < n; i++) {
                r = Math.max(res[i], r);
            }
            out.println(r);
        }
        out.close();
    }
}
