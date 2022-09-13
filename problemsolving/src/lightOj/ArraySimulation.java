package lightOj;

import java.util.Scanner;

public class ArraySimulation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            while (m-- > 0) {
                char s = scan.next().charAt(0);
                if (s == 'S') {
                    int d = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        a[i] += d;
                    }
                } else if (s == 'M') {
                    int d = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        a[i] *= d;
                    }
                } else if (s == 'D') {
                    int k = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        a[i] /= k;
                    }
                } else if (s == 'R') {
                    for (int i = 0, j = n - 1; i < n / 2; i++, --j) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                } else {
                    int k = scan.nextInt();
                    int b = scan.nextInt();
                    int temp = a[k];
                    a[k] = a[b];
                    a[b] = temp;
                }
            }
            System.out.println("Case " + q++ + ":");

            for (int i = 0; i < n; i++) {
                if (i == n-1) {
                    System.out.println(a[i]);
                } else {
                    System.out.print(a[i] + " ");

                }
            }
            

        }
    }

}
