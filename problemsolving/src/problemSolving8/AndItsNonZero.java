package problemSolving8;

import java.util.Scanner;

public class AndItsNonZero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long l = scan.nextInt();
            long r = scan.nextInt() + 1;
            long res = 0;
            for (int i = 0; i < 28; i++) {

                long k = (long) Math.pow(2, i);
                long tot1 = (r / k) / 2 * k;
                if ((r / k) % 2 == 1) {
                    tot1 += (r % k);
                }

                k = (long) Math.pow(2, i);
                long tot2 = (l / k) / 2 * k;
                if ((l / k) % 2 == 1) {
                    tot2 += (l % k);
                }
               
                res = Math.max(tot1 - tot2, res);

            }
            
            System.out.println((r - l) - res);
        }
    }
}
