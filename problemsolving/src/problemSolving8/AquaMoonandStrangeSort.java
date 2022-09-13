package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AquaMoonandStrangeSort {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                b[i] = a[i];
            }
            sort(b);
            for (int i = 0; i < n; i++) {

                if (a[i] != b[i]) {
                    if (i >= n - 2) {
                        System.out.println("NO");
                        continue k;
                    } else {
                        System.out.println("YES");
                        continue k;
                    }
                }
            }
            System.out.println("YES");

        }
    }

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add(i);
        }
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
    }

}
