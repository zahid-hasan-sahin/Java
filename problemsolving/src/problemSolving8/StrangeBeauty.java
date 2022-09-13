package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StrangeBeauty {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] pr = new int[200005];
        for (int i = 0; i < 200005; i++) {
            pr[i] = -1;
        }
        for (long i = 2; i < 200005; i++) {
            if (pr[(int) i] == -1) {
                pr[(int) i] = (int) i;
                for (long j = i * i; j < 200005; j += i) {
                    pr[(int) j] = (int) i;
                }
            }
        }

        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            ArrayList<Integer>[] fre = new ArrayList[200005];

            HashSet<Integer> s = new HashSet<Integer>();;
            for (int i = 0; i < n; i++) {
                int curr = a[i];

                while (curr != 1) {
                    s.add(pr[curr]);
                    curr = curr / pr[curr];
                }
            }
            for (int i : s) {
                fre[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < n; i++) {
                int curr = a[i];
                HashSet<Integer> div = new HashSet<Integer>();
                while (curr != 1) {
                    s.add(pr[curr]);
                    div.add(pr[curr]);
                    curr = curr / pr[curr];
                }
                for (int j : div) {
                    fre[j].add(i);
                }
            }
            for (int i : s) {
                int u = 0;
                int c = n - fre[i].size();
                for (int j = 0; j < n; j++) {
                    if (u < fre[i].size() && fre[i].get(u) == j) {
                        ++j;
                        continue;
                    }
                }
            }

        }
    }
}
