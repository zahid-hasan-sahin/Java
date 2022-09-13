package problemSolving6;

import java.util.Scanner;

public class CardsforFriends {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int k = 0;
            int p = 1;
            while (a % 2 == 0) {
                k += p;
                p *= 2;
                a /= 2;
            }

            while (b % 2 == 0) {
                k += p;
                p *= 2;
                b /= 2;
            }
            ++k;

            if (k >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
