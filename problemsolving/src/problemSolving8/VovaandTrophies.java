package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class VovaandTrophies {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int[] f = new int[n];
        int[] l = new int[n + 1];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'G') {
                c = 1;
            }
            f[i] = c;
        }

        c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'G') {
                c = 1;
            }
            l[i] = c;
        }
        s += 'A';
        ArrayList<store> a = new ArrayList<store>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'G') {
                int k = i;
                while (k <= n && s.charAt(k) == 'G') {
                    ++k;
                }

                a.add(new store(i, k - 1));
                i = k;
            }
        }
        int res = 0;
        for (int i = 0; i < a.size(); i++) {
            boolean b = false;
            store curr = a.get(i);
            if (curr.l - 2 >= 0) {
                if (f[curr.l - 2] == 1) {
                    b = true;
                }
            }
            if (curr.r + 2 < n) {
                if (l[curr.r + 2] == 1) {
                    b = true;
                }
            }
            if (b) {
                res = Math.max(res,curr.r - curr.l + 2);
            } else {
                res = Math.max(res, curr.r - curr.l + 1);
            }
        }
       

        for (int i = 0; i < a.size() - 1; i++) {
            store curr = a.get(i);
            store next = a.get(i + 1);
            if (curr.r + 2 == next.l) {
                boolean b = false;
                if (curr.l - 2 >= 0) {
                    if (f[curr.l - 2] == 1) {
                        b = true;
                    }
                }
                if (next.r + 2 < n) {
                    if (l[next.r + 2] == 1) {
                        b = true;
                    }
                }

                if (b) {
                    res = Math.max(res, next.r - curr.l + 1);
                } else {
                    res = Math.max(res, next.r - curr.l);
                }
            }
        }
        System.out.println(res);
    }
}

class store {

    int l, r;

    store(int l, int r) {
        this.l = l;
        this.r = r;
    }
}
