package ProblemSolving5;

import java.util.Scanner;

public class DiceTower {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            long n = scan.nextLong();
            if (n <= 14) {
                System.out.println("NO");
                continue k;
            }
            n %= 14;
            if (n <= 6 && n!=0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
