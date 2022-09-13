package problemSolving8;

import java.util.Scanner;

public class cfContest1638 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] f = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                f[a[i]] = i;
            }
            int mn = n;
            int c = 0;
            int mn2 = n;
            for (int i = n; i >= 1; i--) {
                if (f[i] < mn) {
                    boolean ch = true;
                    if (mn2 < i) {
                        ch = false;
                    }
                    for (int j = f[i]; j < mn; j++) {
                        mn2 = Math.min(mn2, a[j]);
                    }
                    if (ch) {
                        ++c;
                    }

                }
                mn = Math.min(f[i], mn);

            }

            sb.append(c + "\n");

        }
        System.out.println(sb);
    }
}
