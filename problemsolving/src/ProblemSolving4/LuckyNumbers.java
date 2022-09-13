package ProblemSolving4;

import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long res = 0;
        long t = 2;
        for (int i = 1; i <= n; i++) {
            res += t;
            t *= 2;
        }
        System.out.println(res);
    }
}
