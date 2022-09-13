package problemSolving3;

import java.util.Scanner;

public class SumofOddIntegers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long k = scan.nextInt();
            long u = k * k;
            if (k * k <= n && k % 2 == n % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
