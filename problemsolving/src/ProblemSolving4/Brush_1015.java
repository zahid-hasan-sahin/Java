package ProblemSolving4;

import java.util.Scanner;

public class Brush_1015 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1, n, res = 0, q;
        q = scan.nextInt();
        while (q-- > 0) {
            System.out.print("Case "+t +": ");
            n = scan.nextInt();
            int in;
            for (int i = 0; i < n; i++) {
                in = scan.nextInt();
                if (in > 0) {
                    res += in;
                }
                
            }
            System.out.println(res);
            res = 0;
            ++t;
        }

    }

}
