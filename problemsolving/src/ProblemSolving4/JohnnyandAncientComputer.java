package ProblemSolving4;


import java.util.Scanner;

public class JohnnyandAncientComputer {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            if (b > a) {
                long temp = a;
                a = b;
                b = temp;
            }
            int c = 0;
            while (a > b) {
                if (b * 8 <= a) {
                    b *= 8;
                } else if (b * 4 <= a) {

                    b *= 4;
                } else if (b * 2 <= a) {

                    b *= 2;
                } else {
                    break;
                }
                ++c;
            }
            if (a == b) {
                System.out.println(c);
            } else {
                System.out.println(-1);
            }
        }
    }
}
