package ProblemSolving4;

import java.util.Scanner;

public class Stairs {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int res = (int) Math.ceil(n / 2.0);

        if (res % m == 0) {
            System.out.println(res);
        } else {
            int k = (int) Math.ceil(n / 2.0);
            boolean b = false;
            while (res % m != 0) {
                ++res;
                ++k;
                if (k > n) {
                    b = true;
                    break;
                }
            }
            if (b) {
                System.out.println("-1");
            } else {
                System.out.println(res);
            }
        }
    }

}
