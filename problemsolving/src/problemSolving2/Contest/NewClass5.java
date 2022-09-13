
package problemSolving2;

import java.util.Scanner;

public class NewClass5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            String s = scan.next();
            String res = "";
            int k  = 0;
            for (int i = 0; i <s.length();i++) {
                if((s.charAt(i)-'0')%2==1){
                    res +=s.charAt(i);
                    ++k;
                }
                if(k==2){
                    break;
                }
            }
            if(k==2){
                System.out.println(res);
            }else{
                System.out.println(-1);
            }
            
            
        }
        
        
    }
    
}
