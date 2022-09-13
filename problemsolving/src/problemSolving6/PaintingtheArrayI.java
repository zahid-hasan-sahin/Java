package problemSolving6;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintingtheArrayI {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

        }

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> br = new ArrayList<Integer>();
        ar.add(1000000000);
        br.add(1000000000);
        for (int i = 0; i < n; i++) {
            int p = ar.get(ar.size() - 1);
            int q = br.get(br.size() - 1);
            if (q == a[i]) {
                ar.add(a[i]);
            } else if (p == a[i]) {
                br.add(a[i]);
            } else if (q == a[i] && p == a[i]) {
                ar.add(a[i]);
            } else {
                if (i < n - 1 && p == a[i + 1]) {
                    ar.add(a[i]);
                } else if (i < n - 1 && q == a[i + 1]) {
                    br.add(a[i]);
                } else {
                    ar.add(a[i]);
                }
            }

        }
        int res = 0;
        for (int i = 1; i < ar.size(); i++) {
            if (ar.get(i) != ar.get(i - 1)) {
                ++res;
            }
        }
        for (int i = 1; i < br.size(); i++) {
            if (br.get(i) != br.get(i - 1)) {
                ++res;
            }
        }

        System.out.println(res);
    }
}
