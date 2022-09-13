package problemSolving6;

import java.util.Scanner;

public class ApplejackandStorages {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] f = new int[100010];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            ++f[a[i]];
        }
        int sq = 0;
        int re = 0;

        for (int i = 0; i < 100010; i++) {
            sq += (f[i] / 4);
            re += (f[i] / 2);
        }
        StringBuilder sb = new StringBuilder();
        int q = scan.nextInt();
        while (q-- > 0) {
            char s = scan.next().charAt(0);
            int k = Integer.valueOf(scan.next());
            sq -= (f[k] / 4);
            re -= (f[k] / 2);
            if (s == '-') {
                --f[k];
            } else {
                ++f[k];
            }
            sq += (f[k] / 4);
            re += (f[k] / 2);
            if (sq >= 1 && re >= 4) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }

        }
        System.out.println(sb);

    }

}
