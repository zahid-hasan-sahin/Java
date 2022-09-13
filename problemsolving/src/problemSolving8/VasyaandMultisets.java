package problemSolving8;

import java.util.Scanner;

public class VasyaandMultisets {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] f = new int[101];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            ++f[a[i]];
        }
        int c = 0;
        int k = -1;
        for (int i = 0; i < 101; i++) {
            if (f[i] == 1) {
                ++c;
            }
            if (f[i] >= 3) {
                k = i;
            }
        }
        int[] given = new int[n];
        int p = c / 2;
        for (int i = 0; i < n; i++) {
            if (f[a[i]] == 1 && p > 0) {
                given[i] = 1;
                --p;
            }
        }
        p = c / 2;
        for (int i = 0; i < n; i++) {
            if (f[a[i]] == 1 && p > 0) {
                given[i] = 2;
                --p;
            }
        }
        if (c % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (given[i] == 0) {
                    given[i] = 1;
                }
            }
        } else {
            if (k == -1) {
                System.out.println("NO");
                return;
            } else {

                for (int i = 0; i < n; i++) {
                    if (f[a[i]] == 1 && given[i] == 0) {
                        given[i] = 1;
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (a[i] == k) {
                        given[i] = 2;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (given[i] == 0) {
                        given[i] = 1;
                    }
                }
            }

        }
        System.out.println("YES");
        for (int i = 0; i < n; i++) {
            if(given[i]==1){
                System.out.print("A");
            }else{
                System.out.print("B");
            }
            
        }
        System.out.println();

    }
}
