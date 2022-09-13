
package problemSolving2;

import java.util.Scanner;

public class Divideit {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while(t-->0){
            int res = 0;
            
            long n = scan.nextLong();
            while(n>1){
                long temp = n;
                if(n%2==0){
                    n = n/2;
                }else if(n%3==0){
                    n = (n*2)/3;
                }else if(n%5==0){
                    n = (n*4)/5;
                }
                res++;
                
                if(temp==n){
                    break;
                }
            }
            if(n==1){
                sb.append(res+"\n");
            }else{
                sb.append("-1\n");
            }
            
        }
        System.out.println(sb);
        
        
    }
    
}
