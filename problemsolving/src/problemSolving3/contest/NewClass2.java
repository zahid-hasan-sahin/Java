package problemSolving3;

import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n <= 2) {
                if (n == 1) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(34 + "\n");
                }
            } else {
                String s = "3";
                s = s.repeat(n - 2);
                s = s + 2 + "" + 3;
                if (n > 1) {
                    sb.append(s + "\n");

                } else {
                    sb.append(-1 + "\n");
                }

            }

        }
        System.out.println(sb);

    }

}
