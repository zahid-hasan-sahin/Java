package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class ColumnSwapping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            HashSet<Integer> h = new HashSet<Integer>();
            HashSet<Integer> l = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                ArrayList<Val> ar = new ArrayList<Val>();
                for (int j = 0; j < m; j++) {
                    Val ob = new Val();
                    ob.v = a[i][j];
                    ob.ind = i;
                    ar.add(ob);
                }
                Collections.sort(ar, new myCom1());
                int c = 0;
                for (int j = 0; j < m; j++) {
                    if (ar.get(j).v != a[i][j]) {
                        ++c;
                    }
                }
                if (c > 2) {
                    System.out.println("-1");
                    continue;
                }
                c = 0;
                for (int j = 0; j < m; j++) {
                    if (ar.get(j).v != a[i][j]) {
                        if (ar.get(j).v < a[i][j]) {

                            h.add(j);
                            l.add(ar.get(j).ind);
                        } else {
                            l.add(j);
                            h.add(ar.get(j).ind);
                        }
                    }
                }
            }

            for (int i : h) {
                System.out.print(i  + " ");
            }
            System.out.println();
            for (int i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
            if (h.size() + l.size() == 0) {
                System.out.println(1 + " " + 1);
            } else if (h.size() + l.size() == 2) {
                for (int i : h) {
                    System.out.print(i + 1 + " ");
                }
                for (int i : l) {
                    System.out.print(i + 1 + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}

class Val {

    int v;
    int ind;
}

class myCom1 implements Comparator<Val> {

    @Override
    public int compare(Val a, Val b) {
        return a.v - b.v;
    }

}
