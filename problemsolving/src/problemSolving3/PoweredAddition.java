package problemSolving3;

import java.util.Scanner;

public class PoweredAddition {

    public static int count(int n, int r) {
        int k = 0;
        while (Math.pow(2, k) < n) {
            ++k;
        }
        return k + 1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arra = new int[n];
            int res = 0;
            arra[0] = scan.nextInt();
            for (int i = 1; i < n; i++) {
                int in = scan.nextInt();
                if (in < arra[i - 1]) {
                    int y = arra[i - 1] - in;
                    int x = count(y, res);
                    arra[i] = in + (int) Math.pow(2, x);
                    res = Math.max(res, x - res);
                    System.out.println(y + " " + x + " " + i + " " + arra[i] + " " + res);
                } else {
                    arra[i] = in;
                }
            }
            System.out.println(res);

        }
    }

}
