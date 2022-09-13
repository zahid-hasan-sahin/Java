package problemSolving8;

import java.util.Scanner;

public class AlmostArithmeticProgression {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            temp[i] = a[i];
        }
        if (n <= 2) {
            System.out.println("0");
            return;
        }
        int res = Integer.MAX_VALUE;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int l = a[0] + i;
                int r = a[1] + j;
                a[0] = l;
                a[1] = r;
                int diff = r - l;
                boolean b = true;
                int cal = 0;
                if (i != 0) {
                    ++cal;
                }
                if (j != 0) {
                    ++cal;
                }

                for (int k = 2; k < n; k++) {
                    if (diff != (a[k] - a[k - 1])) {
                        if (a[k] + 1 - a[k - 1] == diff) {
                            a[k] += 1;
                            ++cal;
                        } else if ((a[k] - 1) - a[k - 1] == diff) {
                            a[k] -= 1;
                            ++cal;
                        } else {
                            b = false;
                            break;
                        }
                    }
                }
                if (b) {
                    res = Math.min(res, cal);
                }
                for (int k = 0; k < n; k++) {
                    a[k] = temp[k];
                }
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(res);
        }
    }
}
