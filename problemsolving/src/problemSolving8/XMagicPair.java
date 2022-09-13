package problemSolving8;

import java.util.Scanner;

public class XMagicPair {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long x = scan.nextLong();

            while (a != 0 && b != 0 && a != b) {
                if (x > a && x > b) {
                    System.out.println("NO");
                    continue k;
                }
                if (a == x || b == x) {
                    System.out.println("YES");
                    continue k;
                }
                if (a > b) {
                    long diff = a - b;
                    long diff2 = a - x;
                    if (diff2 % b == 0) {
                        System.out.println("YES");
                        continue k;
                    }
                    long div = diff / b;
                    if (diff % b != 0) {
                        ++div;
                    }
                    a = a - (div * b);
                } else {
                    long diff = b - a;
                    long diff2 = b - x;
                    if (diff2 % a == 0) {
                        System.out.println("YES");
                        continue k;
                    }
                    long div = diff / a;
                    if (diff % a != 0) {
                        ++div;
                    }

                    b = b - (div * a);
                }
            }
            if (a == x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
