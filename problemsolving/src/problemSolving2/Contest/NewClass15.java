
package problemSolving2;

import java.util.Scanner;

public class NewClass15 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int z = 0;
            int p = 0;
            int[] ar = new int[n];
            int b = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                int s = scan.nextInt();
                if(s%2==0){
                    ++z;
                    p = i+1;
                }
                else{
                    ++b;
                    ar[j] = i+1;
                    ++j;
                }
            }
            if(z>0){
                System.out.println(1);
                System.out.println(p);
            }else if(b>1){
                System.out.println(2);
               
                System.out.println(ar[0]+" "+ar[1]);
            }else{
                System.out.println(-1);
                
            }
        }
        
    }
    
}
