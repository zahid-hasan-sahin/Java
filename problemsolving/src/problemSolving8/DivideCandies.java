package problemSolving8;

import java.util.Scanner;

public class DivideCandies {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long m = scan.nextInt();
        long res = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            for (int j = 1; j <= Math.min(n, m); j++) {
                if ((i * i + j * j) % m == 0) {

                    res += ((n - i) / m + 1) * ((n - j) / m + 1);
                }
            }
        }
        System.out.println(res);
    }

}
