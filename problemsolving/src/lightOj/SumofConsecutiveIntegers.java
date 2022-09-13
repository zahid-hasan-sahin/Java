package lightOj;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofConsecutiveIntegers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1;
        int q = scan.nextInt();
        int r = 10000010;
        boolean[] a = new boolean[r];
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for (int i = 2; i < r; i++) {
            if (!a[i]) {
                pr.add(i);
                for (long j = i * (long) i; j < r; j += i) {
                    a[(int) j] = true;
                }
            }
        }

        while (q-- > 0) {
            long n = scan.nextLong();
            int p = (int) Math.sqrt(n);
            int l = pr.size();
            while (n % 2 == 0) {
                n /= 2;
            }
            long res = 1;
            for (int i = 0; i < l && pr.get(i) <= p; i++) {
                int e = pr.get(i);
                if (n % e == 0) {
                    int c = 0;
                    while (n % e == 0) {
                        ++c;
                        n = n / e;
                    }
                    res *= (c + 1);
                }
            }
            if (n > 1) {
                res *= 2;
            }
            System.out.print("Case " + t++ + ": ");
            System.out.println(res - 1);
        }
    }

}
