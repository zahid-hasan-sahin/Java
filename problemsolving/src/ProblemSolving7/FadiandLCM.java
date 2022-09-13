package ProblemSolving7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FadiandLCM {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        ArrayList<Long> ar = new ArrayList<Long>();
        int[] f = new int[1000010];
        long e = n;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int c = 0;
                while (n % i == 0) {
                    n /= i;
                    ++c;
                }
                f[(int) i] = c;
                ar.add(i);
            }
        }

        ArrayList<Long> arr = new ArrayList<Long>();
        if (n >= 2) {
            arr.add(n);
        }
        long a = 1;

        for (int i = 0; i < ar.size(); i++) {
            long p = ar.get((i));
            long q = 1;
            while (f[(int) p] != 0) {
                q *= p;
                --f[(int) p];
            }
            arr.add(q);
        }
        if (e == 1) {
            System.out.println(1 + " " + 1);
            return;
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            a *= arr.get(i);
        }
        long b = arr.get(arr.size() - 1);
        int k = 0;
        while (a > b) {
            b *= arr.get(k);
            a /= arr.get(k);
            ++k;
        }
        long res = Long.valueOf("1000000000000000000");
        int t = 1 << arr.size();
        for (int i = 0; i < t; i++) {
            long q = 1;
            for (int j = 0; j < ar.size(); j++) {
                int p = 1 << j;
                if ((i & p) != 0) {
                    q *= arr.get(j);
                }
            }

            res = Math.min(res, Math.max(q, e / q));
        }
        System.out.println(res + " " + (e / res));
    }
}
