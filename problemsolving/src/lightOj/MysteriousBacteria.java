package lightOj;

import java.util.Scanner;

public class MysteriousBacteria {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long n = scan.nextLong();
            boolean ch = false;
            if (n < 1) {
                n = -n;
                ch = true;
            }
            int m = 1;
            long p = n;
            int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++) {
                if (n % i == 0) {
                    int c = 0;
                    while (n % i == 0) {
                        n = n / i;
                        ++c;
                    }
                //   System.out.println(i+" "+n +" "+c);
                    if (ch) {
                        if (n == 1 && c % 2 == 1) {
                            m = Math.max(c,m);
                        }
                    } else if (n == 1) {
                        m = Math.max(c, m);
                    }
                    n = p;
                }
            }

            System.out.print("Case " + t++ + ": ");

            System.out.println(m);

        }
    }
}
