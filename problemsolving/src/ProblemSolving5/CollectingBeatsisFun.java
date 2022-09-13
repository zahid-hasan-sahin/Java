
package ProblemSolving5;

import java.util.Scanner;

public class CollectingBeatsisFun {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int n = scan.nextInt()*2;
        int[] a = new int[10];
        for (int i = 0; i < 4; i++) {
            String s = scan.next();
            for (int j = 0; j < 4; j++) {
                if(s.charAt(j)!='.'){     
                    
                    ++a[s.charAt(j)-'0'];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if(a[i]>n){
                
                System.out.println("NO");
                return ;
            }
        }
        
        System.out.println("YES");
    }
    
}
