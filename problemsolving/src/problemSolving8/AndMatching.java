package problemSolving8;

import java.util.Scanner;

public class AndMatching {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            if (n == 4 && k == 3) {
                System.out.println("-1");
                continue;
            }
            int[] a = new int[n / 2];
            int[] b = new int[n / 2];
            int ind = -1;
            int p = n - 1;

            for (int i = 0; i < n / 2; i++) {
                a[i] = i;
                b[i] = p--;

                if (b[i] == k) {
                    ind = i;
                }
            }
            if (k != 0) {
                if (k != n - 1) {

                    if (ind == -1) {
                    
                        a[k] = 0;
                        a[0] = k;
                    } else {
                        int temp = b[ind];
                        b[ind] = 0;
                        a[0] = temp;
                    }
                } else {
                    a[3] = 0;
                    a[0] = n - 2;
                    b[1] = 3;

                }
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.println(a[i] + " " + b[i]);
            }
        }
    }

}
