package ProblemSolving4;

import java.util.Scanner;

public class Interview {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            p = p | scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q = q | scan.nextInt();
        }
        System.out.println(p + q);
    }

}
