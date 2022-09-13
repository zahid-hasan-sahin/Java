package ProblemSolving5;

import java.util.Scanner;

public class bulk {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            double d = (c / (double) b);

            if (a == d) {
                System.out.println((c + 1) + " -1");
            } else if (a < d) {
                System.out.println(1 + " -1");
            } else {
                if (b == a) {
                    if (b != 1) {
                        System.out.println("1 " + b);
                    }else{
                        System.out.println("-1 "+b);
                    }
                } else if (b < a) {
                    System.out.println("-1 " + b);
                } else {
                    System.out.println("1 " + b);
                }
            }
        }
    }
}
