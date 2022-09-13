
import java.util.Arrays;
import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int o = 0;
            int z = 0;
            int y = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == '0') {
                    ++z;
                } else if (s.charAt(i) == '1') {
                    ++o;
                } else {
                    ++y;
                }
            }
            int w = Math.abs(o - z);
            if (y > w && (y - w) % 2 == 1) {
                System.out.println("NO");
                continue q;
            } else if (w > y) {
                System.out.println("NO");
                continue q;
            }

            for (int i = k; i < n; i++) {
                if (s.charAt(i) == '0') {
                    ++z;
                } else if (s.charAt(i) == '1') {
                    ++o;
                } else {
                    ++y;
                }
                if (s.charAt(i - k) == '0') {
                    --o;
                } else if (s.charAt(i - k) == '1') {
                    --z;
                } else {
                    --y;
                }
                w = Math.abs(o - z);
                System.out.println(i + " " + w + " " + y);
                if (y > w && (y - w) % 2 == 1) {
                    System.out.println("NO");
                    continue q;
                } else if (w > y) {
                    System.out.println("NO");
                    continue q;
                }
            }
            System.out.println("YES");
        }

    }
}
