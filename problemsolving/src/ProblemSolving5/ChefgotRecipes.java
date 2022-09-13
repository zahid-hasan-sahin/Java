package ProblemSolving5;

import java.util.HashSet;
import java.util.Scanner;

public class ChefgotRecipes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            int k = 1 << 5;
            int[] a = new int[k];
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                int m = 0;
                for (int j = 0; j < s.length(); j++) {

                    if (s.charAt(j) == 'a') {
                        m = m | 1;
                    } else if (s.charAt(j) == 'e') {
                        m = m | (1 << 1);
                    } else if (s.charAt(j) == 'i') {
                        m = m | (1 << 2);
                    } else if (s.charAt(j) == 'o') {
                        m = m | (1 << 3);
                    } else {
                        m = m | (1 << 4);
                    }
                }
               
                ++a[m];
            }
            long res = 0;
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    if ((i | j) == k-1) {
                        res += (a[i] * a[j]);
                    }
                }
            }
            res += ((a[31] * (a[31] - 1)) / 2);
            System.out.println(res);

        }

    }

}
