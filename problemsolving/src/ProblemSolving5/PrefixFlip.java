package ProblemSolving5;

import java.util.Scanner;

public class PrefixFlip {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String a = scan.next();
            String b = scan.next();

            StringBuilder sb = new StringBuilder();
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    sb.append((i + 1) + " " + 1 + " " + (i + 1) + " ");
                    c +=3;
                }
            }
            System.out.print(c + " ");
            System.out.println(sb);
        }
    }

}
