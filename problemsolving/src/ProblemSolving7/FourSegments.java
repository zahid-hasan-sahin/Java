
package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

public class FourSegments {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int  t = scan.nextInt();
        while(t-->0){
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[0]*a[2]);
            
        }
    }
}
