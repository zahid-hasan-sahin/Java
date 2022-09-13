package problemSolving8;

import java.util.Scanner;

public class RunningforGold {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] a = new int[n][5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            int sup = 0;
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < 5; j++) {
                    if (a[sup][j] > a[i][j]) {
                        ++c;
                    }
                }
                if (c >= 3) {
                    sup = i;
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < 5; j++) {
                    if (a[sup][j] < a[i][j]) {
                        ++c;
                    }
                }
                if (c >= 3) {
                    ++count;
                }
            }
            if (count == n - 1) {
                System.out.println(sup + 1);
            } else {
                System.out.println(-1);
            }
        }
    }

}
