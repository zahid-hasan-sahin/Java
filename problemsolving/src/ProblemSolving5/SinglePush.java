package ProblemSolving5;

import java.util.Scanner;

public class SinglePush {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (b[i] < a[i]) {

                    System.out.println("NO");
                    continue q;
                }
                if (b[i] > a[i]) {

                    int k = b[i] - a[i];
                    while (i < n && b[i] - a[i] == k) {
                        ++i;
                    }
                    for (int j = i; j < n; j++) {
                        if (a[j] != b[j]) {
                            System.out.println("NO");
                            continue q;
                        }
                    }
                }
            }
            System.out.println("YES");
        }
    }

}
