package lightOj;

import java.util.Scanner;

public class KSATProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            int[][] a = new int[n][k];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            int p = scan.nextInt();
            int[] b = new int[p];
            for (int i = 0; i < p; i++) {
                b[i] = scan.nextInt();
            }
            boolean r = false;
            p:
            for (int i = 0; i < n; i++) {
                boolean e = false;
                k:
                for (int j = 0; j < k; j++) {
                    if (a[i][j] < 0) {
                        boolean tr = false;
                        for (int l = 0; l < p; l++) {
                            if (b[l] == Math.abs(a[i][j])) {
                                tr = true;
                                break;
                            }
                        }
                        if (!tr) {
                            e = true;
                            break k;
                        }
                    } else {
                        for (int l = 0; l < p; l++) {
                            if (a[i][j] == b[l]) {
                                e = true;
                                break k;
                            }
                        }

                    }
                }
                if (e == false) {
                    r = true;
                    break;
                }
            }
            System.out.print("Case " + t++ + ": ");
            if (r) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }

}
