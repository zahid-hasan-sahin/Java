
import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        w:
        while (t-- > 0) {
            long n = scan.nextLong();
            int s = scan.nextInt();
            String k = String.valueOf(n);
            int r = 0;
            for (int i = 0; i < k.length(); i++) {
                r += (k.charAt(i) - '0');
            }
            long res = 0;
            if (r <= s) {
                System.out.println("0");
            } else {

                for (int i = k.length() - 1; i >= 0; i--) {
                    r -= k.charAt(i) - '0';

                    if (r <= s && k.charAt(i) != '0') {

                        String p = "";
                        for (int j = 0; j < i; j++) {
                            p += k.charAt(j);

                        }
                        String y = "1";
                        for (int j = i; j < k.length(); j++) {
                            p += "0";
                            y += "0";
                        }
                        long w = Long.valueOf(y) + Long.valueOf(p);
                        String q = String.valueOf(w);
                        int u = 0;
                        for (int j = 0; j < q.length(); j++) {
                            u += q.charAt(j) - '0';
                        }
                        if (u > s) {
                            q = 1 + "0" + q.substring(1);
                            w = Long.valueOf(q);

                        } else {
                            res += (w) - n;
                            n = w;
                            break;
                        }
                    } else if (k.charAt(i) != '0') {
                        String p = "";
                        for (int j = 0; j < i; j++) {
                            p += k.charAt(j);
                        }
                        String y = "1";
                        for (int j = i; j < k.length(); j++) {
                            p += "0";
                            y += "0";
                        }
                        res += (Long.valueOf(y) + Long.valueOf(p)) - n;
                        n = Long.valueOf(y) + Long.valueOf(p);
                    }
                }
                System.out.println(res);
            }
        }
    }
}
