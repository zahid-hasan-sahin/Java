package problemSolving6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AdtoNeighbourandRemove {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 2; i * i <= s; i++) {
                if (s % i == 0) {
                    ar.add(i);
                    if (i != s / i) {
                        ar.add(s / i);
                    }
                }
            }
            ar.add(s);
            ar.add(1);
            Collections.sort(ar);
            for (int i = ar.size() - 1; i >= 0; i--) {
                int k = s / ar.get(i);
                int p = 0;
                boolean b = true;
                for (int j = 0; j < n; j++) {
                    if (a[j] > k) {
                        b = false;
                        break;
                    }
                    p += a[j];
                    if (p == k) {
                        p = 0;
                    } else if (p > k) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    System.out.println(n - ar.get(i));
                    break;
                }
            }
        }
    }

}
