
package problemsolving;

import java.util.Scanner;

public class CutandPaste {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0){
            int l = scan.nextInt();
            String s = scan.next();
            int t = 0;
            while(t!=l){
                int temp = s.charAt(t) - '0';
                String sub = s.substring(t+1,s.length());
                String r = "";
                for (int i = 1; i < temp; i++) {
                    r +=sub;                                      
                }
                s = s + r;
                ++t;
                
            }
            System.out.println(s.length());
        }
        
        
    }
    
}
