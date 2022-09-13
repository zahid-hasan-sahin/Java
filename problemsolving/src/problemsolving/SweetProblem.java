package problemsolving;

import java.util.Scanner;

public class SweetProblem {

    public static int middleOfThree(int a, int b,
            int c) {
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return b;
        } else if ((b < a && a < c) || (c < a && a < b)) {
            return a;
        } else {
            return c;
        }
    }

    public static void main(String ags[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int total = scan.nextInt();
        while (total-- > 0) {
            int r = scan.nextInt();
            int g = scan.nextInt();
            int b = scan.nextInt();
            int max = Math.max(r, Math.max(g, b));
            int mid = middleOfThree(r, g, b);
            int min = Math.min(b, Math.min(g, r));

            if (max == r && max == g && max == b) {
                sb.append(g + "\n");
            } else if ((max == r && max == g) || (max == g && max == b) || (max == b && max == r)) {
                sb.append(max < mid + min ? max + (min/2) + "\n" : mid + min + "\n");
            } else {
                sb.append(max <= middleOfThree(r, g, b) + Math.min(r, Math.min(g, b)) ? max + "\n" : middleOfThree(r, g, b) + Math.min(r, Math.min(g, b)) + "\n");
            }

        }
        System.out.print(sb);

    }

}
