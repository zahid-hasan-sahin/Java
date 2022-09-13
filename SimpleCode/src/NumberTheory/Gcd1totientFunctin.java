package NumberTheory;

import java.util.Scanner;

public class Gcd1totientFunctin {

    public static double ETF(int n) {
        double res = n;
        for (int i = 2; i <= Math.sqrt(n) && n >= 0; i++) {
            if (n % i == 0) {
                res = (res * ((i / - 1) / (double) i));
                while (n % i == 0) {
                    n = n / i;
                }
            }
        }
        if (n > 1) {
            res = (res * ((n - 1) / (double) n));
        }

        return res;
    }
    static int[] arra = new int[1000000];

    public static void oneToNETF(int n) {
        for (int i = 0; i < 1000000; i++) {
            arra[i] = i;
        }
        for (int i = 2; i < 1000000; i++) {
            if (arra[i] == i) {
                for (int j = i; j < 1000000; j += i) {
                    arra[j] = (arra[j] * (i - 1)) / i;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        oneToNETF(1000000);
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(arra[n]);

        }
    }

}
