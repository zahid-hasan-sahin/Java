
package ProblemSolving5;

import java.util.Scanner;

public class RobotProgram {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        int  t= scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k =  Math.abs(a-b);
            int res = a + b;
            if(k!=0){
               res +=  (k-1);
            }
            System.out.println(res);
        }
    }
}
