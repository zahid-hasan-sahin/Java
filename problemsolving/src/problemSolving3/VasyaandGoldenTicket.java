package problemSolving3;

import java.util.Scanner;

public class VasyaandGoldenTicket {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        String in = scan.next();
        String s = "";
        for (int i = 0; i < n; i++) {
            if (in.charAt(i) != '0') {
                s = s +in.charAt(i);
                sum += Integer.valueOf(in.charAt(i)-'0');
            }
        }
        n = s.length();
        if (sum == 0) {
            System.out.println("YES");
            return;
        }
        int ts = 0;
        for (int i = 0; i < n; i++) {
            ts += (s.charAt(i) - '0');
            if (sum % ts == 0 && sum != ts) {
                int k = 0;
                for (int j = i + 1; j < n; j++) {
                    k += (s.charAt(j) - '0');
                    if (k == ts && j == n - 1) {
                        System.out.println("YES");
                        return;
                    } else if (k == ts) {
                        k = 0;
                    }
                }
            }

        }
        System.out.println("NO");

    }
}
