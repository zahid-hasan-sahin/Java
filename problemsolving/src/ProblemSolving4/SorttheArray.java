package ProblemSolving4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SorttheArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a);

        boolean ch = true;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int u = 0;
        int q = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] != b[i]) {
                if (ch) {
                    int j = i;
                    q = i;
                    while (b[j] > a[i] && j <= n) {
                        arr.add(b[j]);
                        ++j;
                    }
                    arr.add(b[j]);
                    u = arr.size();
                    int p = arr.size() - 1;
                    for (int k = i; k <= j; k++) {
                        b[k] = arr.get(p);
                        --p;
                    }
                    ch = false;
                } else {
                    System.out.println("no");
                    return;
                }
            }

        }
        System.out.println("yes");
        if (q == 0) {
            System.out.println("1 1");
        } else {
            System.out.println(q + " " + (q + arr.size() - 1));
        }

    }
}
