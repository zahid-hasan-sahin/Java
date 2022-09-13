package problemSolving8;

import java.util.Scanner;

public class GoodString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[] a = new int[n];
            int[] f = new int[10];

            for (int i = 0; i < n; i++) {
                a[i] = s.charAt(i) - '0';
                ++f[a[i]];
            }
            int res = 0;
            for (int i = 0; i < 10; i++) {
                res = Math.max(res, f[i]);
            }

            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    if (i == j) {
                        continue;
                    }
                    boolean isI = true;
                    int tempRes = 0;
                    for (int l = 0; l < n; l++) {
                        if (isI) {
                            if (a[l] == i) {
                                isI = !isI;
                            }
                        } else {
                            if (a[l] == j) {
                                isI = !isI;
                                tempRes += 2;
                            }
                        }
                    }
                    res = Math.max(res, tempRes);
                }

            }
            System.out.println(n - res);
        }
    }

}
