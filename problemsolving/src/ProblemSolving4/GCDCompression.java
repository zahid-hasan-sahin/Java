package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class GCDCompression {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n * 2];
            ArrayList<Integer> o = new ArrayList<Integer>();
            ArrayList<Integer> e = new ArrayList<Integer>();

            for (int i = 0; i < n * 2; i++) {
                a[i] = scan.nextInt();
                if (a[i] % 2 == 0) {
                    e.add(i + 1);
                } else {
                    o.add(i + 1);
                }
            }
            int p = e.size() % 2 == 0 ? e.size() : e.size() - 1;
            int c = 1;
            for (int i = 0; i < p - 1 && c <= n - 1; i+=2) {
                System.out.print(e.get(i) + " ");
                System.out.println(e.get(i + 1));
                ++c;
            }
            p = o.size() % 2 == 0 ? o.size() : o.size() - 1;
            for (int i = 0; i < p - 1 && c <= n - 1; i+=2) {
                System.out.print(o.get(i) + " ");
                System.out.println(o.get(i + 1));
                ++c;
            }
            

        }

    }
}
