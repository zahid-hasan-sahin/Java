package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlmostAllDivisors {

    public static void divisors(ArrayList<Long> arra, long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    arra.add((long) i);
                } else {
                    arra.add((long) i);
                    arra.add(n / i);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Long> div = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                div.add(scan.nextLong());
            }
            Collections.sort(div);
            long res = div.get(0) * div.get(div.size() - 1);
            ArrayList<Long> allDiv = new ArrayList<Long>();
            divisors(allDiv, res);
            Collections.sort(allDiv);
            if (!div.equals(allDiv)) {
                System.out.println(-1);
            } else {
                System.out.println(res);
            }
        }

    }

}
