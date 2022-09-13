package problemSolving2;

import java.util.Scanner;

public class NewClass12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        int b = 0;
        int rs[] = new int[n];
        int rb[] = new int[n];
        for (int i = 0; i < n; i++) {
            rs[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rb[i] = scan.nextInt();
        }
        int cm = 0;
        int k = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            if (rb[i] == rs[i]) {
                ++cm;
                if (rb[i] == 1) {
                    ++k;
                }
            } else if (rs[i] == 1 && rb[i] == 0) {
                ++r;
            } else if (rs[i] == 0 && rb[i] == 1) {
                ++b;
            }
        }
        if (cm == n || n - cm == k) {
            System.out.println("-1");
        } else {
            System.out.println((int) Math.ceil(b / r) + 1);
        }

    }
}
