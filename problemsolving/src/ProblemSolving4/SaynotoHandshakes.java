
package ProblemSolving4;

import java.util.Scanner;

public class SaynotoHandshakes {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            System.out.println((n*(n-1))/2);
        }
        
    }
}
