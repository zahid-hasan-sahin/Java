
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TrailingZeroes {

    static int[] si = new int[1000005];
    static ArrayList<Integer> pr = new ArrayList<Integer>();

    static void sieve() {
        int s = (int) Math.sqrt(1000005);
        for (int i = 2; i < s; i++) {
            if (si[i] == 0) {
                for (int j = i * i; j < 1000005; j += i) {
                    si[j] = 1;
                }
            }
        }
        for (int i = 0; i < 1000005; i++) {
            if (si[i] == 0) {
                pr.add(i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        sieve();

        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long n = scan.nextLong();
            int ans = 1;
            long k = n;
            int p = (int) Math.sqrt(n);
            int e = pr.size();
            for (int i = 2; i < e && n > 0 && pr.get(i) * pr.get(i) <= n; i++) {
                int c = 1;
                int r = pr.get(i);
                while (n % r == 0) {
                    ++c;
                    n = n / r;
                }
                ans *= c;
            }
            if (n > 1) {
                ans *= 2;
            }

            System.out.print("Case " + t++ + ": ");
            System.out.println(ans - 1);
        }
    }
}
