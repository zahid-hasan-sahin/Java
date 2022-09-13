package lightOj;



import java.util.Scanner;

public class KnightsinChessboard_1010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        int n, m;
        int mx = 0;
        int u = 1;
        while (t-- > 0) {
            n = scan.nextInt();
            m = scan.nextInt();
            if (n > m) {
                mx = n;
            } else {
                mx = m;
            }
            sb.append("Case " + u + ": ");
            if (n == 1 || m == 1) {
                sb.append(mx+"\n");
            } else if (n == 2 || m == 2) {
                if (mx % 4 == 0) {
                    sb.append(mx+"\n");
                } else if (mx % 4 == 1) {
                    sb.append((mx / 4) * 4 + 2+"\n");
                } else {

                    sb.append((mx / 4) * 4 + 4+"\n");
                }
            } else {
                if (n * m % 2 == 1) {
                    sb.append(n * m / 2 + 1+"\n");
                } else {
                   sb.append(n * m / 2+"\n");
                }

            }
            ++u;
        }
        scan.close();
        System.out.println(sb.delete(sb.length()-1, sb.length()));

    }

}
