
package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class EhabFailstoBeThanos {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int n =scan.nextInt();
        int[] a = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        long r = 0;
        long k = 0;
        for (int i = 0; i < n; i++) {
            r += a[i];
        }
        for (int i = n; i < 2*n; i++) {
            k += a[i];
        }
        if(k==r){
            System.out.println("-1");
        }else{
            for (int i = 0; i < 2*n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
