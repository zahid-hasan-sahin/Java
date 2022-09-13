package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Birthday {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arra = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arra.add(scan.nextInt());
        }
        Collections.sort(arra);
        int i = 0;
        for (i = 0; i < n; i += 2) {
            System.out.print(arra.get(i) + " ");
        }
        if (i > n) {
            i = n - 1;
        }
        --i;

        for (i = i; i >= 0; i -= 2) {
            System.out.print(arra.get(i) + " ");
        }
        System.out.println();

    }
}
