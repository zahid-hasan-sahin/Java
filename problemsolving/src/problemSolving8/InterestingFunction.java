package problemSolving8;

import java.util.Scanner;

public class InterestingFunction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long l = scan.nextInt();
            long r = scan.nextInt();
            long a = (l / 10) * 11 + (l % 10);
            long b = (r / 10) * 11 + (r % 10);
            long p = 100;
            while (l >= p) {
                a += (l / p);
                p *= 10;
            }
            p = 100;
            while (r >= p) {
                b += (r / p);
                p *= 10;
            }
            System.out.println(b - a);
        }
    }
}
