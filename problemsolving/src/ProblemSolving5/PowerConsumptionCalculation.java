package ProblemSolving5;

import java.util.Scanner;

public class PowerConsumptionCalculation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p1 = scan.nextInt();
        int p2 = scan.nextInt();
        int p3 = scan.nextInt();
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            res += ((b[i] - a[i]) * p1);
        }
     
        for (int i = 0; i < n - 1; i++) {
            int p = a[i+1] - b[i] ;
            res += (Math.min(p, t1) * p1);
            p -= Math.min(p, t1);
            res += (Math.min(p, t2) * p2);
            p -= Math.min(p,t2);
            res +=(p*p3);
        }
        System.out.println(res);

    }

}
