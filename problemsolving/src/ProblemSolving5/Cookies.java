package ProblemSolving5;

import java.util.Scanner;

public class Cookies {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int o = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in % 2 == 0) {
                ++e;
            } else {
                ++o;
            }
        }
        if (o % 2 == 0) {
            System.out.println(e);
        } else {
            System.out.println(o);
        }
    }

}
