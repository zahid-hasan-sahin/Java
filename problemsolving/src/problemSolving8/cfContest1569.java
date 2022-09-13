package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1569 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            char[] a = scan.next().toCharArray();
            String[][] res = new String[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = "-1";
                }
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (a[i] == '2') {
                    ar.add(i);
                }
            }
            for (int i = 0; i < ar.size() - 1; i++) {
                res[ar.get(i)][ar.get(i + 1)] = "+";
                res[ar.get(i + 1)][ar.get(i)] = "-";
            }
            if (ar.size() > 2) {
                res[ar.get(ar.size() - 1)][ar.get(0)] = "+";
                res[ar.get(0)][ar.get(ar.size() - 1)] = "-";
            } else if (ar.size() != 0) {
                System.out.println("NO");
                continue k;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        res[i][j] = "X";
                        continue;
                    }
                    if (res[i][j].equals("-1")) {
                        if (a[i] == '2') {
                            res[i][j] = "=";

                        } else {
                            if (res[j][i].equals("-1") || res[j][i].equals("=")) {
                                res[i][j] = "=";

                            } else {
                                System.out.println("NO");
                                continue k;
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();

            sb.append("YES\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(res[i][j]);
                }
                sb.append("\n");
            }
            System.out.print(sb);
            

        }
    }
}
