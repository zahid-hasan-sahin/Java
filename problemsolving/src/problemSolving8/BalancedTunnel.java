package problemSolving8;

import java.util.Scanner;

public class BalancedTunnel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ind = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
            ind[b[i]] = i;
        }
        int mx = ind[a[0]];
      
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (mx > ind[a[i]]) {
                ++res;
            }
            mx = Math.max(mx, ind[a[i]]);
        }
        System.out.println(res);
    }
}
