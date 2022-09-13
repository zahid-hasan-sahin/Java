package ProblemSolving7;

import java.util.Scanner;

public class CeilDivisions {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder s = new StringBuilder();
        while (t-- > 0) {
            int n = scan.nextInt();
            int c = 0;
            int a = n - 1;
            StringBuilder sb = new StringBuilder();
            if (n > 64) {
                while (a != 64) {
                    ++c;
                    sb.append(a + " " + n + "\n");
                    --a;
                }
                sb.append(n + " " + 64 + "\n");
                sb.append(n + " " + 64 + "\n");
                sb.append(n + " " + 64 + "\n");
                c += 3;
                n = 64;
                a = 63;
                while (a != 4) {
                    sb.append(a + " " + n + "\n");
                    --a;
                    ++c;
                }
                sb.append(n + " " + 4 + "\n");
                sb.append(n + " " + 4 + "\n");
                sb.append(n + " " + 4 + "\n");
                sb.append(3 + " " + 4 + "\n");
                sb.append(4 + " " + 2 + "\n");
                sb.append(4 + " " + 2 + "\n");
                c += 6;

            } else {
                
                while (a >= 3) {
                    sb.append(a + " " + n + "\n");
                    --a;
                    ++c;
                }
                sb.append(n + " " + 2 + "\n");
                sb.append(n + " " + 2 + "\n");
                sb.append(n + " " + 2 + "\n");
                sb.append(n + " " + 2 + "\n");
                sb.append(n + " " + 2 + "\n");
                sb.append(n + " " + 2 + "\n");
                sb.append(n + " " + 2 + "\n");
                c += 7;

            }
            s.append(c + "\n");
            s.append(sb );
        }
        System.out.println(s);

    }
}
