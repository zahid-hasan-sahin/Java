package ProblemSolving7;

import java.util.Scanner;

public class NastiaandNearlyGoodNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (b == 1) {
                System.out.println("NO");
                continue k;
            }
            long r = b * 10;
            long k = (long) a * r;
            System.out.println("YES");
            System.out.println(((r - 1) * a) + " " + (a) + " " + k);
        }

    }

}
