
package ProblemSolving5;

import java.util.Scanner;
public class StrangeFunctions {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int t = scan.nextInt();
        while(t-->0){
            String s = scan.next();
            System.out.println(s.length());
        }
    }
}
