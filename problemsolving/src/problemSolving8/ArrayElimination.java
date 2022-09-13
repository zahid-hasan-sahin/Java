package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayElimination {

    public static boolean isSet(long n,
            long k) {
        if ((n & (1 << k)) > 0) {
            return true;
        } else {
            return false;
        }
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
            int[] fre = new int[32];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 31; j++) {
                    if (isSet(a[i], j)) {
                        ++fre[j];
                    }
                }
            }
            ArrayList<Integer> res = new ArrayList<Integer>();
            k:
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < 32; j++) {
                    if (fre[j] % i != 0) {
                        continue k;
                    }
                }
                res.add(i);
            }
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
    }
}
