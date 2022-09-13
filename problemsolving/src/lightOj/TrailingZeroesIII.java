package lightOj;

import java.util.Scanner;

public class TrailingZeroesIII {

    static long cal(long a) {
        long res = 0;
        for (long i = 5; i <= a; i *= 5) {
            res += (a / i);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            long h = 1000000000;
            long l = 0;
            long mid = h + l;
            long res = -1;
            while (h > l) {
                mid = (h + l) / 2;
                long k = cal(mid);

                if (k == n) {
                    res = mid;
                    break;
                }
                if (k < n) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }

            }
            System.out.print("Case "+t+++": ");
            if (res == -1) {
                System.out.println("impossible");
            } else {
                System.out.println(res / 5 * 5);
            }
        }
    }

}
