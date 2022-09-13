package ProblemSolving4;

import java.util.Scanner;

public class AlenasSchedule {
   

    public static void main(String args[]) {
        
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int i = 0;
        while (i < n && a[i] == 0) {
            ++i;
        }
        --n;
        while (n >= 0 && a[n] == 0) {
            --n;
        }

        int res = 0;
        for (; i <= n - 1; i++) {
            if (a[i] == 0 && a[i + 1] == 0) {
                while (i <= n && a[i] == 0) {
                    ++i;
                }
                --i;
            } else {
                ++res;
            }
        }
        if (n>=0 && a[n] == 1) {
            ++res;
        }
        System.out.println(res);
    }

}
