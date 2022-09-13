package problemSolving6;

import java.util.Scanner;

public class Anothersubstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] f = new int[k + 10];
            int j = 0;
            int i = 0;
            int count = 0;

            while (j < n && count < k) {
                ++f[a[j]];
                if (f[a[j]] == 1) {
                    ++count;
                }
                if (count == k) {
                    break;
                }
                ++j;
            }

            int res = (j - i + 1);
            while (j < n) {
                ++f[a[j]];
                while (f[a[i]] > 1) {
                    --f[a[i]];
                    ++i;
                }
              
                res = Math.min(j - i + 1, res);
                ++j;
            }
            System.out.println(res);
        }

    }
}
