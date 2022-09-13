package problemSolving8;

import java.util.Scanner;

public class IntegerDiversity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[101];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                ++a[Math.abs(in)];
            }
            int res = 0;
            if (a[0] >= 1) {
                res += 1;
            }
           
            for (int i = 1; i <= 100; i++) {
          
                res += Math.min(2, a[i]);
            }
            System.out.println(res);
        }
    }
}
