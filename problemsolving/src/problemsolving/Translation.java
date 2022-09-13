
package problemsolving;

import java.util.Scanner;

public class Translation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toLowerCase();
        String r = scan.next().toLowerCase();
        String t = "";
        for (int i = r.length()-1; i >=0; i--) {
            t = t + r.charAt(i);
            
        }
        if(s.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
        
    }
    
}
