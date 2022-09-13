package ProblemSolving5;

import java.util.Scanner;

public class Fence2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
           int mx = 0;
            for (int i = 0; i < 3; i++) {
                mx = Math.max(mx,scan.nextInt());
            }
            System.out.println(mx+1);
            
        }
    }

}
