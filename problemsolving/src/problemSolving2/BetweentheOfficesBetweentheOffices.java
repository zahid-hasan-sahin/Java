package problemSolving2;

import java.util.Scanner;

public class BetweentheOfficesBetweentheOffices {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        int f = 0;
        int s = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'F' && str.charAt(i + 1) == 'S') {
                ++f;
            } else if (str.charAt(i) == 'S' && str.charAt(i + 1) == 'F') {
                ++s;
            }

        }
        System.out.println(s > f ? "YES" : "NO");

    }

}
