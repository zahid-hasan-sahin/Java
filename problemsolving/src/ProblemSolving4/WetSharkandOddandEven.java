package ProblemSolving4;

import java.util.Arrays;
import java.util.Scanner;

public class WetSharkandOddandEven {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int o = 0;
        long s = 0;
        int u = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            s += in;
            if (in % 2 == 1) {
                ++o;
                u = Math.min(u, in);
            }
        }
        if (o % 2 == 1) {
            System.out.println(s - u);
        } else {
            System.out.println(s);
        }

    }

}
