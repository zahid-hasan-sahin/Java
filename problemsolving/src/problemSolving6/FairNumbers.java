package problemSolving6;

import java.util.Scanner;

public class FairNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            k:
            for (long i = n; i < Long.MAX_VALUE; i++) {
                String s = String.valueOf(i);

                for (int j = 0; j < s.length(); j++) {
                    int p = s.charAt(j) - '0';
                    if (p != 0 && i % p != 0) {
                        continue k;
                    }
                }
                System.out.println(s);
                break;
            }
        }
    }
}
