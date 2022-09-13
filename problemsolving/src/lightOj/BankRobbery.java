package lightOj;

import java.math.BigInteger;

import java.util.Scanner;

public class BankRobbery {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            BigInteger a = new BigInteger(scan.next());
            BigInteger b = new BigInteger("10").multiply(a);
            b = b.divide(new BigInteger("9"));
            long k = b.longValue();

            System.out.print("Case " + t++ + ": ");
            String s = String.valueOf(k);
            if (s.charAt(s.length() - 1) == '0') {
                System.out.print((Long.valueOf(s) - 1));
                System.out.println(" " + s);
            } else {
                System.out.println(s);
            }

        }
    }
}
