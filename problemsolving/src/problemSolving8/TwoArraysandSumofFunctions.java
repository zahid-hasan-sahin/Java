package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TwoArraysandSumofFunctions {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Long> a = new ArrayList<Long>();
        ArrayList<Long> b = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long in = scan.nextInt();
            a.add(in * ((i + 1) * (n - i)));
        }
        for (int i = 1; i <= n; i++) {
            long in = scan.nextInt();
            b.add(in);
        }
        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());

        long res = 0;
        long mod = 998244353;
        for (int i = 0; i < n; i++) {
            res += ((a.get(i) % mod) * (b.get(i) % mod)) % mod;
            res %= mod;
        }
        System.out.println(res);

    }

}
