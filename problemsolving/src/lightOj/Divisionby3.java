package lightOj;

import java.util.Scanner;

public class Divisionby3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            System.out.print("Case " + q++ + ": ");
            long a = scan.nextLong();
            long b = scan.nextLong();
            --a;
            long ar = (a / 3) * 2;
            if (a % 3 == 2) {
                ++ar;
            }
            long br = (b / 3) * 2;
            if (b % 3 == 2) {
                ++br;
            }
            System.out.println(br - ar);
        }

    }
}
