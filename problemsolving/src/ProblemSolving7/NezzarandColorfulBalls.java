
package ProblemSolving7;

import java.util.Scanner;

public class NezzarandColorfulBalls {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int  t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int[] a = new int[1010];
            for (int i = 0; i < n; i++) {
                ++a[scan.nextInt()];
            }
            int mx = 0;
            for (int i = 0; i < 1010; i++) {
                mx = Math.max(a[i],mx);
            }
            System.out.println(mx);
        }
    }
    
}
