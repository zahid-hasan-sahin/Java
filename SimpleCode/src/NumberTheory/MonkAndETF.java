package NumberTheory;

import java.util.Scanner;

public class MonkAndETF {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] pr = new int[1000010];
        for (int i = 2; i < 1000010; i++) {
            if (pr[i] == 0) {
                for (int j = i; j < 1000010; j++) {
                    if (pr[j] == 0) {
                        pr[j] = i;
                    }
                }
            }
        }
        while (t-- > 0) {
            long l = scan.nextLong();
            long r = scan.nextLong();
            int k = scan.nextInt();
            long count = 0;
            for (long i = l; i <= r; i++) {
                long p = i;
                long ph = i;
               
            }

        }
    }
}
