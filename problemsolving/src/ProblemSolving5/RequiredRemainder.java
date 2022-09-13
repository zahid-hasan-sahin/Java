package ProblemSolving5;

import java.util.Scanner;

public class RequiredRemainder {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int res = ((c / a) * a) + b;
            if(res>c){
                res -= a;
            }
            System.out.println(res);
        }
    }
}
