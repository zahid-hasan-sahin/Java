
package ProblemSolving7;

import java.util.Scanner;

public class PolycarpsPockets {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int n = scan.nextInt();
        int[] a =new int[110];
        for (int i = 0; i < n; i++) {
            ++a[scan.nextInt()];
        }
        int res =0;
        for (int i = 0; i < 110; i++) {
            res = Math.max(a[i],res);
        }
        System.out.println(res);
    }
}
