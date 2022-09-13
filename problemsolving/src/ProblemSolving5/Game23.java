package ProblemSolving5;

import java.util.Scanner;

public class Game23 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b % a == 0) {
            int n = b / a;
            int r = 0;

            while (true) {
                if (n == 0) {
                    break;
                }
                if (n % 2 == 0 || n % 3 == 0) {
                    if (n % 2 == 0) {
                        n = n / 2;
                    } else {
                        n = n / 3;
                    }
                    ++r;
                } else {
                    break;
                }
            }

            if (n == 1) {
                System.out.println(r);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }

}
