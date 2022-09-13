package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOneElement {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (a[i - 1] >= a[i]) {
                t.add(i);
            }
        }
        long res = 0;
        for (int i = 1; i < t.size() - 1; i++) {
            res = Math.max(t.get(i + 1) - t.get(i - 1) - 1, res);
        }
        if (t.size() != 0 && t.size() != 1) {
            res = Math.max(res, t.get(1) - 1);
            res = Math.max(res, n - t.get(t.size() - 2) - 1);
        } else {
            if (t.size() == 1) {
                System.out.println(n - 1);
                return;
            }
            System.out.println(n);
            return;
        }

        System.out.println(res);
    }

}
