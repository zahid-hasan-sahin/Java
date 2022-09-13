package problemSolving8;

import java.util.Scanner;

public class LongBeautifulInteger {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        char[] a = scan.next().toCharArray();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        int mnf = n;

        int mnb = n;
        boolean b = true;
        for (int i = 0; i < n; i++) {
            if (res[i] == -1) {
                for (int j = i; j < n; j += k) {
                    if (a[j] > a[i]) {
                        mnf = Math.min(j, mnf);
                    }
                    if (a[j] < a[i]) {
                        mnb = Math.min(j, mnb);
                    }
                    res[j] = a[i] - '0';
                }
            }
        }

        if (mnf < mnb) {

            k:
            for (int i = k - 1; i >= 0; i--) {
                if (a[i] != '9') {
                    for (int j = i; j < n; j += k) {
                        res[j] = a[i] + 1 - '0';
                    }
                    for (int j = i + 1; j < k; j++) {
                        for (int l = j; l < n; l += k) {
                            res[l] = 0;
                        }

                    }
                    break k;
                }
            }
        }
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            System.out.print(res[i]);
        }
        System.out.println();
    }

}
