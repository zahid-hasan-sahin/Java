package problemSolving3;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arra = new int[n];
            for (int i = 0; i < n; i++) {
                arra[i] = scan.nextInt();
            }

            Arrays.sort(arra);
            int d = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arra[i] == arra[i + 1]) {
                    ++d;
                }
            }
            System.out.println(n - d);

        }
    }

}
