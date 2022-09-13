package ProblemSolving5;

import java.util.HashSet;
import java.util.Scanner;

public class DominantPiranha {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        a:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            HashSet<Integer> h = new HashSet<Integer>();
            int mx = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[mx] < a[i]) {
                    mx = i;
                }
                h.add(a[i]);
            }
            if (h.size() == 1) {
                System.out.println("-1");
            } else {
                
                int k = mx;
                while (k >= 0 && a[k] == a[mx]) {
                    --k;
                }
               
                if (k == -1) {
                   
                    k = mx;
                    while (a[k] == a[mx]) {
                        ++k;
                    }
                    --k;
                }else{
                    ++k;
                }
                System.out.println(k + 1);

            }
        }

    }
}
