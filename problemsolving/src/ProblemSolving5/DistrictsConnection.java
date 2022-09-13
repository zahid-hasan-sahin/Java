package ProblemSolving5;

import java.util.HashSet;
import java.util.Scanner;

public class DistrictsConnection {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            HashSet<Integer> hs = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                hs.add(a[i]);
            }
            if (hs.size() == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int p = a[0];
                int k = -1;
                for (int i = 1; i < n; i++) {
                    if (p != a[i]) {
                        k = i;
                        System.out.println(1 + " " + (i + 1));
                    } else {
                        if (k == -1) {
                            for (int j = i; j < n; j++) {
                                if (a[i] != a[j]) {
                                    k = j;
                                    break;
                                }
                            }
                            System.out.println((k + 1) + " " + (i + 1));

                        } else {
                            System.out.println((k + 1) + " " + (i + 1));
                        }
                    }
                }
            }

        }
    }

}
