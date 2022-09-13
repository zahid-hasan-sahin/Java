package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cutting {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        int o = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1) {
                ++o;
            } else {
                ++e;
            }
            if (o == e) {
                if (i != n - 1) {
                    res.add(Math.abs(a[i + 1] - a[i]));
                }
            }
        }
        Collections.sort(res);
        int r = 0;
        int s = 0;
        for (int i = 0; i < res.size(); i++) {
            s += res.get(i);
            if (s <= b) {
                ++r;
            } else {
                break;
            }
        }
        System.out.println(r);

    }

}
