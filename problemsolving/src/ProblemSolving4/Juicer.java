package ProblemSolving4;

import java.util.Scanner;

public class Juicer {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        int d = scan.nextInt();
        long s = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in <= b) {
                s += in;
            }
            if(s>d){
                ++c;
                s = 0;
            }

        }
        System.out.println(c);

    }
}
