package problemSolving3;

import java.util.Scanner;

public class Gamewithstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        s.append(scan.next());
        int n = 0;
        int i = 2;
        while (true) {
            int temp = n;
            for (i = Math.max(0, i - 2); i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s = s.delete(i, i + 2);
                    ++n;
                    break;
                }
            }

            if (temp == n) {
                break;
            }
        }
        System.out.println(n % 2 == 1 ? "YES" : "NO");

    }
}
