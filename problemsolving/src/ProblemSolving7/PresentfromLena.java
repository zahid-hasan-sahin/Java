package ProblemSolving7;

import java.util.Scanner;

public class PresentfromLena {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sp = n * 2;
        StringBuilder sb = new StringBuilder();
        for (int p = 0; p < n + 1; p++) {
            for (int i = 0; i < sp; i++) {
                sb.append(" ");
            }
            for (int i = 0; i < p; i++) {
                sb.append(i + " ");
            }
            for (int i = p; i >= 0; i--) {
                sb.append(i + " ");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append("\n");
            sp -= 2;

        }
        sp = 2;

        for (int p = n - 1; p >= 0; p--) {
            for (int i = 0; i < sp; i++) {
                sb.append(" ");
            }
            for (int i = 0; i < p; i++) {
                sb.append(i + " ");
            }
            for (int i = p; i >= 0; i--) {
                sb.append(i + " ");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append("\n");
            sp += 2;

        }

        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }

}
