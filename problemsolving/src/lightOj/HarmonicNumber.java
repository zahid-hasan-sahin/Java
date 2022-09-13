package lightOj;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        double[] d = new double[100001];
        int t = 1;
        double g = 0.57721566490;
        for (int i = 1; i < 100001; i++) {
            d[i] = d[i - 1] + (1.0 / i);
        }
        while (q-- > 0) {
            int n = scan.nextInt();
            System.out.print("Case " + t++ + ": ");
            if (n < 100001) {
                System.out.println(d[n]);
            } else {
                double res = Math.log(n + 0.5) + g;
                System.out.println(res);
            }
        }
    }

}
