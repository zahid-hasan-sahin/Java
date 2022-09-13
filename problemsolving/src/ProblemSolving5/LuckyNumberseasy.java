package ProblemSolving5;

import java.util.Scanner;

public class LuckyNumberseasy {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long t = 0;
        long res = Long.MAX_VALUE;
        q:
        for (int i = 2; i <= 10; i += 2) {
            for (int j = 0; j < (1 << i); j++) {
                if (Integer.bitCount(j) != i / 2) {
                    continue;
                }
                t = 0;
                for (int k = 0; k < i; k++) {
                    if ((j & (1 << k)) >= 1) {
                        t = t * 10 + 4;
                    } else {
                        t = t * 10 + 7;
                    }
                }
                if (t >= n) {
                    res = Math.min(res, t);
                }
            }
        }
        System.out.println(res);

    }

}
