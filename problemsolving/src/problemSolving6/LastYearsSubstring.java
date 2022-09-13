package problemSolving6;

import java.util.Scanner;

public class LastYearsSubstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int p = -1;
            if (s.charAt(0) == '2') {
                if (s.charAt(1) == '0' && s.charAt(2) == '2' && s.charAt(3) == '0') {
                    System.out.println("YES");
                    continue;
                } else if (s.charAt(n - 3) == '0' && s.charAt(n - 2) == '2' && s.charAt(n - 1) == '0') {
                    System.out.println("YES");
                    continue;
                } else if (s.charAt(1) == '0' && s.charAt(n - 2) == '2' && s.charAt(n - 1) == '0') {
                    System.out.println("YES");
                    continue;
                } else if (s.charAt(1) == '0' && s.charAt(2) == '2' && s.charAt(n - 1) == '0') {
                    System.out.println("YES");
                    continue;
                }
            } else {
                if (s.charAt(n - 4) == '2' && s.charAt(n - 3) == '0' && s.charAt(n - 2) == '2' && s.charAt(n - 1) == '0') {
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }

}
