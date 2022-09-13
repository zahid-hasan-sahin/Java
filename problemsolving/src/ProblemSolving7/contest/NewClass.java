package ProblemSolving7;

import java.util.Scanner;

public class NewClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 1 || y == 1) {
                sb.append("0\n");
                continue;
            }
            int p = 1;
            long res = 0;
            while (p <= y) {
                int k = x / p;
                if (Math.min(k - 1, y) - p >= 0) {
                    res += Math.min(k - 1, y) - p;
                }

                if (k == 0 || k <= p) {
                    break;
                }
                ++p;
            }
            sb.append(res + "\n");
        }
        System.out.println(sb);

    }
}
