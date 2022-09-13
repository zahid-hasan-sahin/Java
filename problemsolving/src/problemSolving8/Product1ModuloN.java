package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class Product1ModuloN {

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (gcd(n, i) == 1) {
                ar.add(i);
            }
        }
        long g = 1;
        for (int i = 0; i < ar.size(); i++) {
            g = ((g % n) * (ar.get(i) % n)) % n;
        }

        long r = g % n;

        if (r == 1) {
            System.out.println(ar.size());
            for (int i = 0; i < ar.size(); i++) {
                System.out.print(ar.get(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println(ar.size() - 1);
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i) == r) {
                    continue;
                }
                System.out.print(ar.get(i) + " ");
            }

            System.out.println();
        }
    }
}
                                       