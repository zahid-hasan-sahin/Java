package ProblemSolving4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HelpOz {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

        }
        Arrays.sort(a);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int k = a[n - 1] - a[n - 2];
     
        for (int i = 1; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                if (i != 1 && k / i != i) {
                    int r = a[0] % i;
                    int c = 0;
                    for (int j = 0; j < n; j++) {
                        if (a[j] % i == r) {
                            ++c;
                        }
                    }
                    if (c == n) {
                        arr.add(i);
                    }
                }
                int r = a[0] % (k / i);
                int c = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] % (k / i) == r) {
                        ++c;
                    }

                }

                if (c == n) {
                    arr.add(k / i);

                }

            }
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
