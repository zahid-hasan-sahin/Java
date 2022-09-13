package ProblemSolving4;

import java.util.Scanner;

public class NewClass4 {

    public static void main(String arsgs[]) {
        Scanner scan = new Scanner(System.in);
    
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            long r = 0;

            while (a <= n && b <= n) {
                if (a > b) {
                    b += a;
                } else {
                    a += b;
                }
                ++r;
            }
            System.out.println(r);

        }

    }

}
