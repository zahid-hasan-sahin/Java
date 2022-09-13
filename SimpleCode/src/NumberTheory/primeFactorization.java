package NumberTheory;

import java.util.Scanner;

public class primeFactorization {

    public static void PrimeFact(long n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int c = 0;
                while (n % i == 0) {
                    n = n / i;
                    c++;
                }
                System.out.print(i + "^" + c + " ");
            }

        }
        if (n > 1) {
            System.out.print(n + "^" + 1);
        }
    }

    public static void primeFactUsingSieve(int[] a, int n) {
        for (int i = 2; i <= n; i++) {
            if (a[i] == 0) {
                for (int j = i; j <= n; j += i) {
                    if (a[j] == 0) {
                        a[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(a[i] + " " + i);
        }

    }
    public static void main(String args[]) {
        PrimeFact(7816980);
    }

}
