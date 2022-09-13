package NumberTheory;

import java.util.Scanner;

public class FactorizationUsingSieve {

    public static void factorization(int[] a) {
        int n = a.length;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            if (a[i] == 0) {
                for (int j = i; j < n; j += i) {
                    if (a[j] == 0) {
                        a[j] = i;
                    }
                }
            }
        }
    }

    public static void Fact(long n) {
        long mx = -1;
        long m = n;

        if (n % 2 != 0) {
            System.out.print(2 + "^0");
        }
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                int c = 0;
                while (n % i == 0) {
                    n = n / i;
                    ++c;
                }
                if (i == 2) {
                    System.out.print(i + "^" + c);
                } else {
                    System.out.print("*" + i + "^" + c);
                }
            }
        }
        if (n > 1 && m != n) {
            System.out.println("*" + n + "^1");
        }
        System.out.println();

    }

    public static void primeFact(int[] a, int n) {
        while (n != 1) {
            if (n / a[n] != 1) {
                System.out.print(a[n] + "*");
            } else {
                System.out.println(a[n]);
            }
            n = n / a[n];
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {
            Fact(i);
        }

    }
}
