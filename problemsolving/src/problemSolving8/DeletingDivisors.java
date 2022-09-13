package problemSolving8;

import java.util.Scanner;

public class DeletingDivisors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n % 2 == 1) {
                System.out.println("Bob");
            } else {
                int p = n;
                int c = 0;
                while (p % 2 == 0) {
                    p /= 2;
                    ++c;
                }
                if (p == 1) {
                    if (c % 2 == 0) {
                        System.out.println("Alice");
                    } else {
                        System.out.println("Bob");
                    }
                } else {
                    System.out.println("Alice");
                }
            }
        }
    }
}
