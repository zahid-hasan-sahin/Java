package ProblemSolving7;

import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int[] arr = new int[100000];

            int mn = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = scan.nextInt();

                if (arr[i] != 0) {
                    mn = i;
                }
            }
            int res = mn;
            int[] r = new int[100000];
            while (true) {
                boolean ck = false;
                r[res] = 1;
                for (int i = 1; i <= res; i++) {
                    if (r[i] != 0) {

                        if (i > a) {
                            ck = true;
                            if (arr[i] == 0) {
                                r[i - a] += 1;
                                if (arr[i - a] != 0) {
                                    --r[i - a];
                                    --arr[i - a];
                                }
                                if (res == 6) {
                                    System.out.println(arr[i - a] + " " + (i - a));
                                }
                            } else {
                                --arr[i];
                            }

                        }
                        if (i > b) {
                            ck = true;
                            if (arr[i] == 0) {
                                r[i - b] += 1;
                                if (arr[i - b] != 0) {
                                    --r[i - b];
                                    --arr[i - b];
                                }
                                if (res == 6) {
                                    System.out.println(arr[i - b] + " " + (i - b));
                                }
                            } else {
                                --arr[i];
                            }
                        }
                    }
                }
                boolean ch = true;
                for (int i = 1; i <= mn; i++) {
                    if (arr[i] > 0) {
                        ch = false;
                    }
                }
                if (ch) {
                    break;
                }
                if (!ck) {
                    for (int i = 0; i <= res; i++) {
                        r[i] = 0;
                    }
                    ++res;
                }
            }
            System.out.println(res);
        }

    }
}
