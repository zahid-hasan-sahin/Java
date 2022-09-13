package problemSolving3;

import java.util.Scanner;

public class Maximums {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long s = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in > 0) {
                s += in;
                sb.append(s + " ");
            } else {
                sb.append((s + in) + " ");
            }

        }
        System.out.println(sb);

    }

}
