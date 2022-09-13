package problemSolving3;

import java.util.Scanner;

public class ConstructtheString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < n; i++) {
                s.append((char) ((i % b) + 'a'));
            }
            sb.append(s);
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
