package ProblemSolving5;

import java.util.Scanner;

public class VerseForSanta {

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
            int s = 0;
            int i = 0;
            int m = 0;
            for (i = 0; i < n; i++) {
                if (s + a[i] > k) {
                    break;
                }
                s += a[i];
                if (a[m] < a[i]) {
                    m = i;
                }
            }
            if (n == i) {
                System.out.println("0");
            } else if (a[i] < a[m]) {
                System.out.println(m + 1);
            } else if (i < n - 1 && s + a[i + 1] <= k) {
                System.out.println(i);
            }else{
                System.out.println(0);
            }

        }
    }

}
