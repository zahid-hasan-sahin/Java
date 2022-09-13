package ProblemSolving5;

import java.util.Scanner;

public class Dividingthenumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long t = n * (long) (n + 1);
        t /= 2;
        System.out.println(t % 2);

        t /= 2;
        n = Math.min(n, (int) t);
        int p = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n + " ");
            ++k;
            p += n;
            if (t - p <= 0) {
                break;
            }
            if (t - p < n) {
                sb.append(t - p);
                ++k;
                break;
            }
            --n;
        }
        System.out.println(k+" "+sb);
        

    }
}
