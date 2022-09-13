package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

public class Ropewalkers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        Arrays.sort(a);
        int p = a[1] - d;
        int res = Math.max(a[0] - p, 0);

        p = a[1] + d;
        res += Math.max(p - a[2], 0);
        System.out.println(res);
       
    }

}
