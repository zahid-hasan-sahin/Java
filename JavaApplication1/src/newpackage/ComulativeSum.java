
package newpackage;

import java.util.Scanner;

public class ComulativeSum {
    public static void main(String args[]){
        int[] arra = {3,5,7,2,8,1,3};
        int[] sum = new int[arra.length];
       sum[0] = arra[0];
        for (int i = 1; i < arra.length; i++) {
            sum[i] = sum[i-1]+arra[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
        
        
        
        
        
    }
    
}
