
package problemSolving3;

import java.util.Scanner;

public class MaximumofMaximumsofMinimums {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        if(k==1){
            int mx = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                mx = Math.min(mx, in);
            }
            System.out.println(mx);
        }else if(k>=3){
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                mx = Math.max(mx, in);
            }
            System.out.println(mx);
        }else {
            int f =0,l=0;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if(i==0){
                    f = in;
                }if(i==n-1){
                    l = in;
                }
            }
            System.out.println(Math.max(f, l));
        }
        
    }
}
