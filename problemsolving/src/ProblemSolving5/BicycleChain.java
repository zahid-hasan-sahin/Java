
package ProblemSolving5;

import java.util.Scanner;

public class BicycleChain {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int n =scan.nextInt();
        int a[] = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b  = new int[10005];
       int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int in = scan.nextInt();
            for (int j = 0; j < n; j++) {
                if(in%a[j]==0){
                    ++b[in/a[j]];
                    p = Math.max(p,in/a[j]);
                }
            }
        }
        
        System.out.println(b[p]);
    }
    
}
