package problemSolving6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class EqualRectangles {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n * 4];
            for (int i = 0; i < n * 4; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int i = 0;
            int j = 4 * n - 1;
            HashSet<Integer> h = new HashSet<Integer>();
            while (i < j) {
                if (a[i + 1] != a[i] || a[j - 1] != a[j]) {
                   
                    System.out.println("NO");
                    continue k;
                }
                h.add(a[i] * a[j]);
                i += 2;
                j -= 2;
            }
            if (h.size() == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
