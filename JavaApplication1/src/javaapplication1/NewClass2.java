
package javaapplication1;

import java.util.Scanner;

public class NewClass2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int c= 0;
        for (int i = 0; i < s.length()-1; i++) {
            System.out.println(s.charAt(i)+"=="+(char)((s.charAt(i)+1)-1));
            if(s.charAt(i)==(char)((s.charAt(i)+1)-1)){
                c++;
                
            }
            
        }
        System.out.println(c);
        
        
        
    }
}
