package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DivisionandUnion {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<seg> a = new ArrayList<seg>();

            int[] right = new int[n];

            for (int i = 0; i < n; i++) {
                seg s = new seg();
                s.l = scan.nextInt();
                s.r = scan.nextInt();
                a.add(s);
             
                right[i] = s.r;
            }
            Collections.sort(a, new myCom());
            int r = a.get(0).r;
            for (int i = 0; i < n; i++) {
                if (a.get(i).l <= r) {
                    r = Math.max(r, a.get(i).r);;
                }
            }
            int[] res = new int[n];
            boolean b = false;
            boolean c = false;
            for (int i = 0; i < n; i++) {
                if (right[i] <= r) {
                    res[i] = 1;
                    b = true;
                } else {
                    res[i] = 2;
                    c = true;
                }
            }
            if (b && c) {
                for (int i = 0; i < n; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }

        }

    }

}

class seg {

    int l, r;

}

class myCom implements Comparator<seg> {

    @Override
    public int compare(seg ob1, seg ob2) {
        int f = ob1.l;
        int l = ob2.l;
        return f - l;

    }

}
