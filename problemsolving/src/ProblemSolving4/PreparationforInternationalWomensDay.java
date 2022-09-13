package ProblemSolving4;

import java.util.Scanner;

public class PreparationforInternationalWomensDay {

    public static void main(String agsg[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[110];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a[i] = in;
            b[in % m]++;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (b[(m - a[i] % m) % m] >= 2) {
                b[a[i] % m]--;
                b[(m - a[i] % m) % m]--;
                res += 2;
            }
        }
        System.out.println(res);
    }
}
