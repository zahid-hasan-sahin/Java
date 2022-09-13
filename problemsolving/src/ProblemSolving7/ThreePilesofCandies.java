
package ProblemSolving7;

import java.util.Scanner;

public class ThreePilesofCandies {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int t = scan.nextInt();
        while(t-->0){
            long s = 0;
            for (int i = 0; i < 3; i++) {
                s +=scan.nextLong();
            }
            System.out.println(s/2);
        }
    }
    
}
