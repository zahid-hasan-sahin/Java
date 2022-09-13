package lightOj;

import java.util.ArrayList;
import java.util.Scanner;

public class LCMfrom1ton {

    static long m = (long) Math.pow(2, 32);

    static int pow(int a, int b) {
        int res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                --b;
                res *= a;
            }
            a *= a;
            b = b / 2;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1;
        boolean[] a = new boolean[100000010];
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for (int i = 2; i < 100000010; i++) {
            if (!a[i]) {
                pr.add(i);
                for (long j = (long) i * i; j < 100000010; j += i) {
                    a[(int) j] = true;
                }
            }
        }

        int q = scan.nextInt();
        int p = pr.size();
        while (q-- > 0) {
            int n = scan.nextInt();
            long res = 1;
            for (int i = 0; i < p && pr.get(i) <= n; i++) {
                int k = 1;
                int e = pr.get(i);
                while (pow(e, k) <= n) {
                    res = ((res % m) * (e % m)) % m;
                    ++k;
                }

            }
            System.out.print("Case " + t++ + ": ");
            System.out.println(res);
        }

    }

}
