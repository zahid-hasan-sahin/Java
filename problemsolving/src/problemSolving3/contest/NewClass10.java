package problemSolving3;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int arra[] = new int[n];
            for (int i = 0; i < n; i++) {
                arra[i] = scan.nextInt();
            }
            Arrays.sort(arra);
            int r = 1;
            int k = 1;
            int d = 1;
            for (int i = 0; i < n - 1; i++) {
                if (arra[i] == arra[i + 1]) {
                    ++k;
                    r = Math.max(r, k);
                } else {
                    ++d;
                    k = 1;
                }
            }
               System.out.println(d+" "+r);
            if (r > d) {
                --r;
            } else {
                --d;
            }

            System.out.print(Math.min(r, Math.min(d, n / 2)) + "\n");

        }
        System.out.println(sb);
    }

}
