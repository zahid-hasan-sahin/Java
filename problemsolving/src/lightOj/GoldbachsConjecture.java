package lightOj;

import java.util.ArrayList;
import java.util.Scanner;

public class GoldbachsConjecture {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1;
        int e = 10000050;
        int q = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        boolean[] pr = new boolean[e];
        for (int i = 2; i < e; i++) {
            if (!pr[i]) {
                a.add(i);
                for (long j = i * (long) i; j < e; j += i) {
                    pr[(int) j] = true;
                }
            }
        }

        while (q-- > 0) {
            int n = scan.nextInt();
            int c = 0;
            for (int i = 0; n >= a.get(i); i++) {
                if (!pr[n - a.get(i)]) {
                    if (n - a.get(i) == a.get(i)) {
                        ++c;
                    }
                    ++c;
                }
            }
            System.out.print("Case " + t++ + ": ");
            System.out.println(c / 2);
        }
    }

}
