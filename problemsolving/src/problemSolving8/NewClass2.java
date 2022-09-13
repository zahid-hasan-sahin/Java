package problemSolving8;

import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int l = 1;
            int r = n;
            System.out.println(3 * n);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3 * n; i += 6) {
                sb.append("1 " + l + " " + r + "\n");
                sb.append("2 " + l + " " + r + '\n');
                sb.append("1 " + l + " " + r + "\n");
                sb.append("2 " + l + " " + r + '\n');
                sb.append("1 " + l + " " + r + "\n");
                sb.append("2 " + l + " " + r + '\n');
                ++l;
                --r;
            }
            System.out.println(sb.delete(sb.length() - 1, sb.length()));
        }
    }
}
