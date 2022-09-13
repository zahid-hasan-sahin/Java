package ProblemSolving5;

import java.util.Scanner;

public class HammingDistanceSum {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int n = a.length();
        int m = b.length();
        long res = 0;
        int o = 0;
        int z = 0;
        int u = 0;

        for (int i = 0; i < m; i++) {
            if (i < n) {
                if (a.charAt(i) == '0') {
                    ++z;
                } else {
                    ++o;
                }
            }

            if (m - i < n) {

                if (a.charAt(u++) == '0') {
                    --z;
                } else {
                    --o;
                }

            }
            if (b.charAt(i) == '0') {
                res += o;
            } else {
                res += z;
            }
        }
        System.out.println(res);
    }

}
