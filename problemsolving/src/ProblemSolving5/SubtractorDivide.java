package ProblemSolving5;

import java.util.Scanner;

public class SubtractorDivide {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n == 1 || n == 2 || n==3) {
                System.out.println(n - 1);
            }else{
               if(n%2==0){
                   System.out.println(2);
               }else{
                   System.out.println(3);
               }
            }
        }
    }

}
