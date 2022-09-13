package problemSolving8;

import java.util.Scanner;

public class AddonaTree {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            ++a[u];
            ++a[v];
        }

        for (int i = 1; i <= n; i++) {
            if (a[i] == 2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
