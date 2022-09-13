package ProblemSolving4;

import java.util.Scanner;

public class Browser {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pos = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int res = 0;
        if (l == 1 && r == n) {
            System.out.println("0");
            return;
        } else if (l == 1 && r != n) {
            res = Math.abs(pos - r) + 1;
        } else if (l != 1 && r == n) {
            res = Math.abs(pos - l) + 1;
        } else {
            res = r - l + Math.min(Math.abs(pos - r), Math.abs(pos - l)) + 2;
        }
        System.out.println(res);
    }

}
