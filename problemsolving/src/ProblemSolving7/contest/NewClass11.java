package ProblemSolving7;

import java.util.HashSet;
import java.util.Scanner;

public class NewClass11 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        HashSet<String> a = new HashSet<String>();
        char[] ch = new char[n + 100];
        int k = 1;
        ch[0] = 'a';
        p:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                String s = String.valueOf((char) (i + 'a')) + (char) (j + 'a');
                String w = String.valueOf(ch[k - 1]) + (char) (i + 'a');
                if (!a.contains(s) && !a.contains(w) && !s.equals(w)) {
                    a.add(s);
                    a.add(w);
                    ch[k++] = (char) (i + 'a');
                    ch[k++] = (char) (j + 'a');
                    if (k > n) {
                        break p;
                    }
                }
            }
        }
        int p = 0;
        int r = k;
        while (k < n + 2) {
            ch[k++] = ch[p++];
            if (r == p) {
                p = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

}
