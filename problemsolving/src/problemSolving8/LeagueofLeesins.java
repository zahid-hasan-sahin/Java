package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LeagueofLeesins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fre = new int[n + 1];
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < n - 2; i++) {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            ar.add(scan.nextInt());
            ar.add(scan.nextInt());
            ar.add(scan.nextInt());
            ++fre[ar.get(0)];
            ++fre[ar.get(1)];
            ++fre[ar.get(2)];
            Collections.sort(ar);
            String x = ar.get(0) + "#" + ar.get(1);
            boolean ch1 = true;
            boolean ch2 = true;
            boolean ch3 = true;
            if (!h.containsKey(x)) {
                h.put(x, ar.get(2));
                ch1 = false;
            }
            String y = ar.get(0) + "#" + ar.get(2);
            if (!h.containsKey(y)) {
                h.put(y, ar.get(1));
                ch2 = false;
            }
            String z = ar.get(1) + "#" + ar.get(2);
            if (!h.containsKey(z)) {
                h.put(z, ar.get(0));
                ch3 = false;
            }

            x = ar.get(1) + "#" + ar.get(0);
            if (!h.containsKey(x) && ch1) {
                h.put(x, ar.get(2));
            }
            y = ar.get(2) + "#" + ar.get(0);
            if (!h.containsKey(y) && ch2) {
                h.put(y, ar.get(1));
            }
            z = ar.get(2) + "#" + ar.get(1);
            if (!h.containsKey(z) && ch3) {
                h.put(z, ar.get(0));
            }
        }
        int[] res = new int[n + 1];
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int[] vis = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (fre[i] == 1) {
                x.add(i);
                vis[i] = 1;
            } else if (fre[i] == 2) {
                y.add(i);
                vis[i] = 1;
            }
        }
        k:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (x.get(i) < y.get(j)) {
                    String r = x.get(i) + "#" + y.get(j);
                    if (h.containsKey(r)) {
                        res[0] = x.get(i);
                        res[1] = y.get(j);
                        if (i == 0) {
                            res[n - 1] = x.get(1);
                        } else {
                            res[n - 1] = x.get(0);
                        }

                        if (j == 0) {
                            res[n - 2] = y.get(1);
                        } else {
                            res[n - 2] = y.get(0);
                        }

                        break k;
                    }
                } else {
                    String r = y.get(j) + "#" + x.get(i);
                    if (h.containsKey(r)) {

                        res[0] = x.get(i);
                        res[1] = y.get(j);

                        if (i == 0) {
                            res[n - 1] = x.get(1);
                        } else {
                            res[n - 1] = x.get(0);
                        }

                        if (j == 0) {
                            res[n - 2] = y.get(1);
                        } else {
                            res[n - 2] = y.get(0);
                        }
                        break k;
                    }
                }
            }
        }

        for (int i = 2; i < n - 2; i++) {
            String start = "";

            if (h.containsKey(res[i - 2] + "#" + res[i - 1]) && vis[h.get(res[i - 2] + "#" + res[i - 1])] == 0) {
                start = res[i - 2] + "#" + res[i - 1];
            } else {
                start = res[i - 1] + "#" + res[i - 2];
            }

            int g = h.get(start);
            vis[g] = 1;
            res[i] = g;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
