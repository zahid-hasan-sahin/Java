package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class SagesBirthday {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int[] res = new int[n];
        int k = 0;
        for (int i = 1; i < n; i += 2) {
            res[i] = a[k++];
        }
        for (int i = 0; i < n; i += 2) {
            res[i] = a[k++];
        }
        long r = 0;
        for (int i = 1; i < n - 1; i += 2) {
            if (res[i] < res[i - 1] && res[i] < res[i + 1]) {
                ++r;
            }
        }
        System.out.println(r);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

    }
}
