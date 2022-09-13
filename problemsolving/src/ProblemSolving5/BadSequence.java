package ProblemSolving5;

import java.util.Scanner;
import java.util.Stack;

public class BadSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int l = 0;
        int r = 0;
        int mn = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ++l;
                ++k;
            } else {
                ++r;
                --l;
            }
            mn = Math.min(mn, l);
        }
        
      
       if(mn>=-1 && k==r){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }

}
