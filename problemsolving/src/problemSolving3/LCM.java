package problemSolving3;

import java.util.Scanner;

public class LCM {

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int res =  (gcd(n, m));
        System.out.println(res);
    }

}
