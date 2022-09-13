package problemSolving3.contest;

import java.util.Scanner;

public class cfConteest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            long sum1 = 0;
            long sum2 = 0;
            int mn = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                mn = Math.min(mn, a[i]);
            }
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == mn) {
                    k = i;
                    break;
                }
            }
            if (n % 2 == 0) {
                if (k % 2 == 0) {
                    System.out.println("Joe");
                } else {
                    System.out.println("Mike");
                }

            } else {
                System.out.println("Mike");
            }

        }
    }
}
