package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NegativePrefixes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            ArrayList<Integer> r = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
                if (b[i] == 0) {
                    r.add(a[i]);
                }
            }
            Collections.sort(r, Collections.reverseOrder());
            int e = 0;
            for (int i = 0; i < n; i++) {
                if (b[i] == 0) {
                    a[i] = r.get(e++);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }
    }

}
