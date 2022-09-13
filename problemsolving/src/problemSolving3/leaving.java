package problemSolving3;

import java.util.Arrays;
import java.util.Scanner;

public class leaving {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] ar  = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = scan.nextInt();
            }
            Arrays.sort(ar);
            for (int i = n-1; i >=0; i--) {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }

}
