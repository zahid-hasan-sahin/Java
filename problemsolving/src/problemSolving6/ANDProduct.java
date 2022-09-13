package problemSolving6;

import java.util.Scanner;

public class ANDProduct {

    static double log2(double a) {
        return Math.log(a) / Math.log(2);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            int x = (int) Math.ceil(log2(a + 1));
            int y = (int) Math.ceil(log2(b + 1));
            long[] ch = new long[35];
            for (int i = 0; i < Math.min(x, y); i++) {
                long p = (long) Math.pow(2, i);
                if (a / p == b / p) {
                    long r = a / p;
                    if (r % 2 == 1) {
                        ch[i] = 1;
                    }
                }
            }
            long res = 0;
            for (int i = 0; i <= 34; i++) {
                if (ch[i] == 1) {
                    res += Math.pow(2, i);
                }
            }
            System.out.println(res);
        }

    }

}
