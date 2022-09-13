package problemSolving3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiddleClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            
            int n = scan.nextInt();
            int k = scan.nextInt();
            ArrayList<Long> arra = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                arra.add(scan.nextLong());
            }
            Collections.sort(arra, Collections.reverseOrder());
            int i = 0;
            ArrayList<Long> sum = new ArrayList<Long>();
            sum.add(arra.get(0));
            for (i = 1; i < n; i++) {
                sum.add(sum.get(i - 1) + arra.get(i));
            }
            long c = 0;
            
            for (int j = 0; j < n; j++) {
                long p = sum.get(j) / (j + 1);
                if (p >= k) {
                    ++c;
                } else {
                    break;
                }
            }
            System.out.println(c);
        }

    }
}
