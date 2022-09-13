package problemSolving8;

import java.util.Scanner;

public class ArrayReodering {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] res = new int[n];
            int p = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    res[p++] = a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1) {
                    res[p++] = a[i];
                }
            }

            int r = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                  
                    if (gcd(res[i], res[j] * 2) > 1) {
                        ++r;
                    }
                }
              
            }
            System.out.println(r);

        }
    }
}
