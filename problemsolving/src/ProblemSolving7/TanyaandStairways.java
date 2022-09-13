package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class TanyaandStairways {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 2];

        a[n] = 1;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {

            if (a[i] == 1) {
                ar.add(a[i - 1]);
            }
        }
        System.out.println(ar.size());
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();
    }

}
