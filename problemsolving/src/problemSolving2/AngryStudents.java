package problemSolving2;

import java.util.Scanner;

public class AngryStudents {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int r = 0;
            int k = 0;
            int i = 0;
            if (!s.contains("A")) {
                System.out.println(0);
            } else {
                while (s.charAt(i) != 'A') {
                    ++i;
                }
                for (i = i; i < s.length(); i++) {

                    if (s.charAt(i) == 'A' || i == n - 1) {
                        if (s.charAt(i) == 'P') {
                            ++k;
                        }
                        r = Math.max(r, Math.min(s.length(), k));
                        k = 0;
                    } else {
                        ++k;
                    }

                }
                System.out.println(r);

            }
        }
    }
}
