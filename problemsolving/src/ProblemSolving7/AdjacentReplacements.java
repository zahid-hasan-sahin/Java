package ProblemSolving7;

import java.util.Scanner;

public class AdjacentReplacements {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if(in%2==0){
                a[i] = in-1;
            }else{
                a[i] = in;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    
}
