
package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacingElements {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int t = scan.nextInt();
        while(t-->0){
            int n  = scan.nextInt();
            int d = scan.nextInt();
            int[] a  = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if(a[i]<=d){
                    ++k;
                }
            }
            Arrays.sort(a);
            if(a[0]+a[1]<=d || k==n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
    
}
