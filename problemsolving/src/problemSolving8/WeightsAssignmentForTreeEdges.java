package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightsAssignmentForTreeEdges {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            int[] a = new int[n];
            for (int i = 0; i <= n; i++) {
                graph[i] = new ArrayList<Integer>();
            }
            int root = 0;
            for (int i = 1; i <= n; i++) {
                int in = scan.nextInt();
                if (i == in) {
                    root = i;
                } else {
                    graph[i].add(in);
                }

            }

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] temp = new int[n + 1];
            int[] res = new int[n + 1];

            for (int i = 0; i <= n; i++) {
                temp[i] = -1;
            }
            int c = 1;
            temp[root] = 0;
            if (root != a[0]) {
                System.out.println("-1");
                continue;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == root) {
                    continue;
                }
                int an = graph[a[i]].get(0);
                if (temp[an] == -1) {
                    System.out.println(-1);
                    continue k;
                } else {
                    res[a[i]] = c - temp[an];
                    temp[a[i]] = c;
                }
                ++c;
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }

}
