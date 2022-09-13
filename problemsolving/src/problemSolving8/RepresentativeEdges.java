package problemSolving8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RepresentativeEdges {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (n == 1) {
                System.out.println("0");
                continue k;
            }
            int res = 1000000000;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int k = a[j] - a[i];
                    int c = 0;
                    for (int l = 0; l < n; l++) {
                        int p = a[i] + ((l - i) * k);
                        if (a[l] != p) {
                            ++c;
                        }
                    }
                 
                    res = Math.min(res, c);
                }
            }
            System.out.println(res);
        }

    }
}
