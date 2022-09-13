
import java.util.Arrays;
import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int o = 0;
            int e = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) % 2 == 1) {
                    ++o;
                } else {
                    ++e;
                }
            }
            int p = 0;
            for (int i = 0; i < n; i += 2) {
                if (s.charAt(i) % 2 == 1) {
                    ++p;
                }
            }
            int k = 0;
            for (int i = 1; i < n; i += 2) {
                if (s.charAt(i) % 2 == 0) {
                    ++k;
                }
            }
            if (p == k) {
                if (o >= e) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else if (p >= k) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }

        }

    }

}
