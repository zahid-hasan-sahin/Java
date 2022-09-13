package problemSolving8;

import java.util.Scanner;

public class CasimirsStringSolitaire {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int[] a = new int[3];
            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 'A']++;
            }
            if (a[1] == a[0] + a[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
