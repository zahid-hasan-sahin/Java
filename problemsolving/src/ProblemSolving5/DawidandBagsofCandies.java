package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class DawidandBagsofCandies {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[4];

        for (int i = 0; i < 4; i++) {
            a[i] = scan.nextInt();

        }
        Arrays.sort(a);
        if (a[0] + a[3] == a[1] + a[2]) {
            System.out.println("YES");
        } else if (a[3] == a[0] + a[1] + a[2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
