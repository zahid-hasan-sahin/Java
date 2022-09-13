package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class math {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = n;
        if (n == 1) {
            System.out.println("1 0");
            return;
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (long i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                a.add((int) i);
                int c = 0;
                while (p % i == 0) {
                    p /= i;
                    ++c;
                }
                ar.add(c);
            }
        }
        if (p >= 2) {
            a.add(p);
            ar.add(1);
        }
        long res = 1;
        for (int i = 0; i < a.size(); i++) {
            res *= a.get(i);
        }
        HashSet<Integer> h = new HashSet<Integer>();
        int mx = 0;
        for (int i = 0; i < ar.size(); i++) {
            h.add(ar.get(i));
            mx = java.lang.Math.max(mx, ar.get(i));
        }
        int r = 0;
        while (mx != 1) {
            if (mx % 2 == 1) {
                mx += 1;
                ar.clear();
                ar.add(mx);
            } else {
                for (int i = 0; i < ar.size(); i++) {
                    if (ar.get(i) % 2 == 1) {
                        ++r;
                        break;
                    }
                }
                ar.clear();
                ar.add(mx);
                mx /= 2;
            }
            ++r;
        }
        System.out.print(res + " ");
        System.out.println(r);

    }
}
