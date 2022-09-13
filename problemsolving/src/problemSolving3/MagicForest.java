package problemSolving3;

import java.util.Scanner;

public class MagicForest {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                long x = i ^ j;
                if (x < j || i + j <= x || x > n) {
                    continue;
                }
                ++res;
            }

        }

        System.out.println(res);

    }

}
