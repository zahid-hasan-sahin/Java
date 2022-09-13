package NumberTheory;

import java.util.Scanner;

public class FactDigite {

    static long fact(int a, int b) {
        long res = 0;
        while (a / b >= 1) {
            res += a / b;
            a = a / b;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a += Math.log10(i);
        }

        System.out.println(Math.floor(a) + 1);

    }

}
