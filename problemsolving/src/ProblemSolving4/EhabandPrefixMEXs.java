
package ProblemSolving4;

import java.util.Scanner;

public class EhabandPrefixMEXs {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int n = scan.nextInt();
        int c = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a[i]= in;
            if(in==0){
                ++c;
            }
        }
       
        if(c==n){
            System.out.println("-1");
        }else{
            int i = 0;
            while(a[i]==0){
                System.out.print("1 ");
                ++i;
            }
            for (int j = i; j < n; j++) {
                System.out.print("0 ");
            }
        }
        System.out.println();
        
    }
    
}
