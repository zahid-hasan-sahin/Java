package ProblemSolving4;

import java.util.Scanner;

public class TwoArrays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = n + m + 10;
        int r = m + 10;
        int[][] a = new int[c][r];
        for (int i = 0; i < c; i++) {
            a[i][0] = 1;
            if (i < r) {
                a[i][i] = 1;
            }
        }
        int mod = 1000000007;
        for (int i = 2; i < c; i++) {
            for (int j = 1; j < r; j++) {
                a[i][j] = ((a[i - 1][j - 1] % mod) + (a[i - 1][j] % mod)) % mod;
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
            }
        }
        System.out.println(a[n + (2 * m) - 1][2 * m]);

    }

}





//import java.util.Scanner;
//
//public class A {
//    public static long modInv(long a, long n, long m) {
//        long res = 1;
//        while (n != 0) {
//            if (n % 2 == 1) {
//                res = ((res % m) * (a % m)) % m;
//                --n;
//            }
//            a = ((a % m) * (a % m)) % m;
//            
//            n = n / 2;
//        }
//        return res;
//    }
//    static long c(int n, int k) {
//        int m = 1000000007;
//        long res = 1;
//        if (k > n - k) {
//            k = n - k;
//        }
//        for (int i = 0; i < k; ++i) {
//            res = ((res % m) * ((n - i) % m)) % m;
//            res = ((res) * (modInv((i + 1), m - 2, m))) % m;
//        }
//
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        System.out.println(c(n+(2*m)-1,2*m));
//    }
//
//}
//
