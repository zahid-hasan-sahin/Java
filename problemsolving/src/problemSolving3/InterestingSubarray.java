
package problemSolving3;

import java.util.Scanner;

public class InterestingSubarray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            int l = 0;
            int f = 0;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if(in<mn){
                    mn = in;
                    l = i+1;
                }
                if(mx<in){
                    mx = in;
                    f = i+1;
                }
            }
            if(mx-mn>=n){
                System.out.println("YES");
                System.out.println(f+" "+l);
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
