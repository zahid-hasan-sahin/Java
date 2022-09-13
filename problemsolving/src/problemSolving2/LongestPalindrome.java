
package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestPalindrome {
    static String pol(String s){
        String k ="";
        int n = s.length();
        for (int i = n-1; i >=0 ; i--) {
            k+=s.charAt(i);
        }
        return k;
}

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> v = new ArrayList<String>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < n; i++) {
            v.add(scan.next());
        }
        
        String res ="";
        for (int i = 0; i < v.size(); i++) {
            String t = pol(v.get(i));
            
            for (int j = 0; j < v.size(); j++) {            
                if(t.equals(v.get(j))){
                    res+=v.get(i);  
                    v.remove(i);
                    break;
                }
                
                
            }
        }
        System.out.println(res.length());
        System.out.println(res);
        
        
        
        
        
    }
    
}
