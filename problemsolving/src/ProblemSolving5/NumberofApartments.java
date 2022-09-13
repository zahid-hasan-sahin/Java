package ProblemSolving5;

import java.util.Scanner;

public class NumberofApartments {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            for (int i = 0; i < 335; i++) {
                for (int j = 0; j < 210; j++) {
                    int k = 3 * i + 5 * j;
                    int u = n - k;
                    if (u >= 0 && u % 7 == 0) {
                        System.out.println(i + " " + j + " " + u / 7);
                        continue k;
                    }
                }
            }
            System.out.println(-1);
        }
    }

}
