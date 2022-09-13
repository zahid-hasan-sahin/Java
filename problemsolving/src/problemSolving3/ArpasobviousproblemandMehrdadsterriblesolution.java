package problemSolving3;

import java.util.Scanner;

public class ArpasobviousproblemandMehrdadsterriblesolution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[] temp = new long[1000009];
        long d = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            d += temp[a^m];
            temp[a]++;
           
        }
        System.out.println(d);
    }
}
