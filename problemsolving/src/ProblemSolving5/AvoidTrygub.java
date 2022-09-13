
package ProblemSolving5;

import java.util.Scanner;

public class AvoidTrygub {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            String s = scan.next();
            int[] a = new int[26];
            for (int i = 0; i < n; i++) {
                ++a[s.charAt(i)-'a'];
            }
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)!='t'){
                    System.out.print(s.charAt(i));
                }
            }
            while(a['t'-'a']!=0){
                System.out.print("t");
                --a['t'-'a'];
            }
            System.out.println();
        }
    }
    
}
