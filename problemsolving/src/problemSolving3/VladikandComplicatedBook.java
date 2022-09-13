package problemSolving3;

import java.util.Scanner;

public class VladikandComplicatedBook {

    public static void main(String argts[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arra = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arra[i] = scan.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int p = scan.nextInt();
            int q = arra[p];
            int y = p;
            for (int i = l; i <= p; i++) {
                if (q < arra[i]) {
                    --p;
                }
            }
            for (int i = p + 1; i <= r; i++) {
                if (q > arra[i]) {
                    ++p;
                }
            }

            if (y == p) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        System.out.println(sb);
    }

}
