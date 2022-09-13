package problemSolving6;

import java.util.Scanner;

public class pbinary {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 1; i <= 64; i++) {
            int p = n - (k * i);
            if (p <= 0) {
                continue;
            }
            String s = Integer.toBinaryString(p);
            int c = 0;
            int e = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    c += s.length() - (j);
                    ++e;
                }
            }
            if (c >= i && e <= i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

}
