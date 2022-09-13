package problemSolving3;

import java.util.Scanner;

public class GivenLengthandSumofDigits {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (m > (n * 9) || n > m) {
            System.out.println("-1 -1");
        } else {
            int u = m / 9;
            String s = "";
            int i = 0;
            for (i = 0; i < u; i++) {
                s += "9";
            }
            s += m % 9 == 0 ? "" : m % 9;
            String k = "";
            for (i = s.length() - 1; i >= 0; i--) {
                k += s.charAt(i);
            }
            System.out.println(s + " " + k);
        }

    }

}
