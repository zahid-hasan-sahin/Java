package lightOj;

import java.util.Scanner;

public class ANewFunction {

    public static void main(String agrs[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            long res = 0;
            long k = (long) Math.sqrt(n);
            for (int i = 2; i <= k; i++) {
                long j = n / i;
               
                res = res + (((j + i) * (j - i + 1)) / 2);
                res = res + (i * (j - i));
            }
            System.out.print("Case "+t+++": ");
            System.out.println(res);
        }
    }

}
