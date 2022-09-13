package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {

            int n = scan.nextInt();
            int k = scan.nextInt();
            int g = n - (k - 2);
            if (g % 2 == 0) {
                for (int i = 0; i < k - 2; i++) {
                    sb.append(1 + " ");
                }
                sb.append(g / 2 + " " + g / 2 + "\n");
            } else {
                for (int i = 0; i < k - 3; i++) {
                    sb.append(1 + " ");
                }
                n = n - (k - 3);
                if (n % 3 == 0) {
                    sb.append(n / 3 + " " + (n / 3) + " " + (n / 3) + "\n");
                } else if (n % 4 == 0) {
                    int p = n / 2;
                    sb.append(p + " " + (p / 2) + " " + (p / 2) + "\n");
                } else {
                    int p = (n - 2);
                    sb.append(2 + " " + (p / 2) + " " + (p / 2) + "\n");
                }
            }

        }
        System.out.println(sb);

    }
}
