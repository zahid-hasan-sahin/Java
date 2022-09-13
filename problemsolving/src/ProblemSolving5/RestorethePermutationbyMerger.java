package ProblemSolving5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RestorethePermutationbyMerger {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[1000];
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i = 0; i < 2 * n; i++) {
                int k = scan.nextInt();
                if (a[k] == 0) {
                    ++a[k];
                    res.add(k);
                }
            }
            for (int k : res) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
