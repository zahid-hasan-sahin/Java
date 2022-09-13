package ProblemSolving5;

import java.util.Scanner;

public class AddCandies {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0){
            int p = scan.nextInt();
            System.out.println(p);
            for (int i = 1; i <=p; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
