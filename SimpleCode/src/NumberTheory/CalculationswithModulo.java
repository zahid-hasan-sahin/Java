package NumberTheory;

import java.util.Scanner;

public class CalculationswithModulo {

    public static long pow(int a, int b, int c, int m) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = ((res * a)) % m;
                --b;
            }
            a = ((a * a)) % m;
            b = b / 2;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(pow(a, b, c, m));

    }

}
