
package problemsolving;

import java.util.Scanner;

public class CaseoftheZerosandOnes {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         String s = scan.next();
         int one = 0;
         int zero =0;
         for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='0'){
                ++zero;
            }else{
                ++one;
            }
        }
         System.out.println(n-(Math.min(zero, one))*2);
    }
    
}
