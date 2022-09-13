package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class YetAnotherBrokenKeyboard {
     static int countNonEmptySubstr(String str) 
    { 
        int n = str.length(); 
        return n * (n + 1) / 2; 
    } 

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        boolean[] ch = new boolean[26];
        for (int i = 0; i < k; i++) {
            ch[scan.next().charAt(0) - 'a'] = true;
        }
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(ch[s.charAt(i)-'a']==true){
                temp = temp + (char)(s.charAt(i));
            }
        }
        System.out.println(temp);
        System.out.println(countNonEmptySubstr(temp));
        
    }

}