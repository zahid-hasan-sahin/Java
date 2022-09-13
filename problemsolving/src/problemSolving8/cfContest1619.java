package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class cfContest1619 {

    static void sort(int[] a) {
        int n = a.length;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            ar.add(a[i]);
        }
        Collections.sort(ar);
        for (int i = 0; i < n; i++) {
            a[i] = ar.get(i);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            ArrayList<st> a = new ArrayList<st>();
            for (int i = 0; i < n; i++) {
                int[] temp = new int[m];
                for (int j = 0; j < m; j++) {
                    temp[j] = scan.nextInt();
                }
                sort(temp);
                st ob = new st();
                ob.x = temp[m-2];
                ob.y = temp[m-1];
                a.add(ob);
            }
            Collections.sort(a, new Custom());
           
            int mx = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                mx = Math.min(a.get(i).x, mx);
            }

            if (mx < a.get(n - 1).x) {
                int c = 0;
                for (int i = 0; i < n - 1; i++) {
                    if (a.get(i).x == mx) {
                        ++c;
                    }
                }
                if (c == 1) {
                    mx = a.get(n - 1).x;
                }
            }
            System.out.println(mx);
        }
    }
}

class Custom implements Comparator<st> {

    @Override
    public int compare(st a, st b) {
        if (a.y == b.y) {
            return 0;
        } else if (a.y > b.y) {
            return -1;
        } else {
            return 1;
        }
    }

}

class st {

    int x;
    int y;
}
