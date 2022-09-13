package ProblemSolving4;

import java.util.Scanner;

public class pineapple {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = scan.nextInt();
        int k = 0;
        int y = scan.nextInt();
        boolean b = false;
        if (t + 1 == y) {
            System.out.println("NO");
            return;
        }
        while (t + s * k <= y) {
            int p = t + s * k;
            ++k;
           
            if (p + 1 == y || p == y) {
                b = true;
                break;
            }

        }
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
