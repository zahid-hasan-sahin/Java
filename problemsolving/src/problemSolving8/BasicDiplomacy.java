package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BasicDiplomacy {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            ArrayList<Integer>[] free = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                free[i] = new ArrayList<Integer>();
            }
            int r = (int) Math.ceil(m / 2.0);
            for (int i = 1; i <= m; i++) {
                int k = scan.nextInt();
                for (int j = 0; j < k; j++) {
                    free[scan.nextInt()].add(i);
                }
            }
            int pos = 0;
            ArrayList<st> ar = new ArrayList<st>();
            for (int i = 1; i <= n; i++) {
                pos += Math.min(r, free[i].size());
                ar.add(new st(i, free[i].size()));
            }

            if (pos < m) {
                System.out.println("NO");
            } else {
                Collections.sort(ar, new myCom());
                int[] res = new int[m + 1];
                int c = 0;
                k:
                for (int i = 0; i < n; i++) {
                    int count = 0;
                    for (int j = 0; j < free[ar.get(i).id].size(); j++) {
                        if (res[free[ar.get(i).id].get(j)] == 0) {
                            res[free[ar.get(i).id].get(j)] = ar.get(i).id;
                            ++c;
                            ++count;
                        }
                        if (c == m) {
                            break k;
                        }
                        if (count == r) {
                            break;
                        }
                    }
                }
                System.out.println("YES");
                for (int i = 1; i <= m; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            }
        }
    }
}

class st {

    int id, s;

    st(int a, int b) {
        id = a;
        s = b;
    }
}

class myCom implements Comparator<st> {

    @Override
    public int compare(st a, st b) {
        return a.s - b.s;
    }

}
