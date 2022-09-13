package problemSolving6;

import java.util.Scanner;

public class ElementExtermination {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (a[0] < a[n - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
