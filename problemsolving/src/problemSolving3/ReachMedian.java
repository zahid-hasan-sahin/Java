package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReachMedian {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        ArrayList<Integer> arra = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arra.add(scan.nextInt());
        }
        Collections.sort(arra);
        long f = 0, l = 0;
        for (int i = 0; i < n / 2; i++) {
            if (arra.get(i) > a) {
                f += arra.get(i) - a;
            }
            if (arra.get(n - 1 - i) < a) {
                l += a - arra.get(n - 1 - i);
            }
        }
        System.out.println(f + l + (Math.abs(arra.get(n / 2) - a)));

    }

}
