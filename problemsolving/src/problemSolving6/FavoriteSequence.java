package problemSolving6;

import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            ArrayList<Integer> ar = new ArrayList<Integer>();
            int i = 0;
            int j = n - 1;
            while (i < j) {
                ar.add(a[i]);
                ar.add(a[j]);
                i++;
                --j;
            }
            if (n % 2 == 1) {
                ar.add(a[n / 2]);
            }
            for (int k = 0; k < n; k++) {
                System.out.print(ar.get(k) + " ");
            }
            System.out.println();
        }
    }

}
