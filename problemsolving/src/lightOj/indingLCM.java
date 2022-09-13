package lightOj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class indingLCM {

    static void rem(ArrayList<Integer> a, int k, int i) {
        int n = a.size();
        while (i < n && a.get(i) == k) {
            a.remove((Object) k);
            --n;
        }
    }

    static long lcm(long a, long b) {
        long res = a * b;
        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return res / a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            long l = scan.nextLong();
            long lc = lcm(a, b);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int m = (int) Math.sqrt(l);
            for (int i = 2; i <= m; i++) {
                if (l % i == 0) {
                    while (l % i == 0) {
                        l /= i;
                        ar.add(i);
                    }
                }
            }
            if (l > 1) {
                ar.add((int) l);
            }      
            
            boolean c = false;
           
            int e = (int) Math.sqrt(lc);
            for (int i = 2; i <= e; i++) {
                if (lc % i == 0) {
                    int counter = 0;
                    while (lc % i == 0) {
                        lc /= i;
                        ++counter;
                    }

                    int p = ar.indexOf(i);
                    int y = ar.lastIndexOf(i);

                    int o = y - p + 1;

                    if (p == -1 || counter > o) {
                        c = true;
                    } else if (o == counter) {
                        rem(ar, i, p);
                    }
                }
            }

            if (lc > 1) {
                int p = ar.indexOf((int) lc);
                int y = ar.lastIndexOf((int) lc);
                if (ar.indexOf((int) lc) == -1) {
                    c = true;
                } else if (y - p + 1 == 1) {
                    int v = (int) lc;
                    rem(ar, v, p);
                }

            }
           
            System.out.print("Case " + t++ + ": ");
            if (c) {
                System.out.println("impossible");
            } else {
                long res = 1;
                for (int i = 0; i < ar.size(); i++) {
                    res *= ar.get(i);
                }
                System.out.println(res);
            }

        }
    }
}
