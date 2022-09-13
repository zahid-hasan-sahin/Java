
package problemSolving2;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k1 = scan.nextInt();
            int k2 = scan.nextInt();
            int[] fk = new int[n];
            int[] lk = new int[n];
            int res = 0;
            for (int i = 0; i < k1; i++) {
               fk[i] = scan.nextInt();
               if(fk[i] == n){
                   res++;
               }
            }
            for (int i = 0; i < k2; i++) {
               lk[i] = scan.nextInt();
               
            }
            System.out.println(res>0?"YES":"NO");
        }
        
        
        
        
    }
    
}
