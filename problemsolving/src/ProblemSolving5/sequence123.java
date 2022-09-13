package ProblemSolving5;

import java.util.Scanner;

public class sequence123 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in == 1) {
                ++a;
            } else if (in == 2) {
                ++b;
            } else {
                ++c;
            }
        }
        System.out.println(n-Math.max(a, Math.max(b,c)));
    }

}
