package ProblemSolving7;

import java.util.Scanner;

public class GeniussGambit {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int k = scan.nextInt();
        --b;
        int p = a + b;
        System.out.println(k+" "+b+" "+p);
        if (k + b > p || (b == 0 && k != 0)) {
            System.out.println("NO");
            return;
        }
        StringBuilder sb = new StringBuilder();

        sb.append("1");
        for (int i = 0; i < b; i++) {
            sb.append("1");
        }
        for (int i = 0; i < a; i++) {
            sb.append("0");
        }

        sb.append("\n1");
        for (int i = 0; i < k; i++) {
            sb.append("0");
        }
        for (int i = 0; i < b; i++) {
            sb.append("1");
        }
        for (int i = 0; i < a - k; i++) {
            sb.append("0");
        }
        System.out.println("YES");
        System.out.println(sb);

    }

}
