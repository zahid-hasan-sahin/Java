package lightOj;

import java.util.Scanner;

public class PositiveNegativeSign {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long res = (m) * (n / 2);
            System.out.print("Case " + t++ + ": ");
            System.out.println(res);
        }
    }

}
