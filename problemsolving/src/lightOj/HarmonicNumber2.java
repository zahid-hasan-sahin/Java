package lightOj;

import java.util.Scanner;

public class HarmonicNumber2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1;
        int q = scan.nextInt();
        while (q-- > 0) {
            long n = scan.nextLong();
            int p = (int) Math.sqrt(n);
            long res = 0;
            for (int i = 1; i <= p; i++) {
                long u = n / i;
                res += u;
                res += ((u - (n / (i + 1))) * i);
                if (n / i == i) {
                    res -= i;
                }
            }
            System.out.print("Case "+t+++": " );
            System.out.println(res);
        }
    }

}
