package problemSolving3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> arra = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arra.add(scan.nextInt());
            }
            Collections.sort(arra);
            int u = n / 2;
            int p = u - 1;
            for (int i = 0; u < n && p >= 0; u++, p--) {
                System.out.print(arra.get(u) + " " + arra.get(p) + " ");
            }
            if (n % 2 == 1) {
                System.out.print(arra.get(n - 1));
            }
            System.out.println();
        }

    }

}
