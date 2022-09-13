package lightOj;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofFactorials {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        long[] a = new long[20];
        a[0] = 1;
        for (int i = 1; i < 20; i++) {
            a[i] = a[i - 1] * i;
        }

        while (t-- > 0) {
            long n = scan.nextLong();
            ArrayList<Integer> r = new ArrayList<Integer>();
            int k = 19;
            while (k >= 0 && n != 0) {
                if (a[k] <= n) {
                    n = n - a[k];
                    r.add(k);
                }
                --k;
            }
            System.out.print("Case "+q+++": ");
            if (n == 0) {
                for (int i = r.size() - 1; i >= 0; i--) {
                    if (i == 0) {
                        System.out.println(r.get(i) + "!");
                    } else {
                        System.out.print(r.get(i) + "!+");
                    }

                }
               

            } else {
                System.out.println("impossible");
            }
        }
    }
}
