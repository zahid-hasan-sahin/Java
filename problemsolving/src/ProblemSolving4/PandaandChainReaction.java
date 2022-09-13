
package ProblemSolving4;

import java.util.Scanner;

public class PandaandChainReaction {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int max = 1000004;
        long[] arra = new long[max];
        arra[0]=arra[1] = 1;
        for (int i = 1 ; i < max; i++) {
            arra[i] = (arra[i-1]*i)%(max-1);
        }
        while(t-->0){
            long n = scan.nextLong();
            long x = scan.nextLong();
            if(n>=max){
                System.out.println(0);
                continue;
            }
            
            long res = (arra[(int)n] * x)%(max-1);
            System.out.println(res);
            
        }
        
    }
    
}
