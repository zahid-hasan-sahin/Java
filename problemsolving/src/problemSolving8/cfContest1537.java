package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1537 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                ar.add(scan.nextInt());
            }
            int l = 0;
            int r = 1;
            int mn = 2000000000;
            Collections.sort(ar);
            for (int i = 0; i < n - 1; i++) {
                if (ar.get(i + 1) - ar.get(i) < mn) {
                    mn = ar.get(i + 1) - ar.get(i);
                    l = i;
                    r = i + 1;
                }
            }

            System.out.print(ar.get(l)+" ");
            for (int i = r + 1; i < n; i++) {
                System.out.print(ar.get(i) + " ");
            }
            for (int i = 0; i < l; i++) {
                System.out.print(ar.get(i) + " ");
            }

            System.out.println(ar.get(r));

        }
    }
}
