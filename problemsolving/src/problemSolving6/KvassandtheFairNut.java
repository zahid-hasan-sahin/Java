package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class KvassandtheFairNut {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long s = scan.nextLong();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        if (sum < s) {
            System.out.println("-1");
        } else {
            Arrays.sort(a);
            long r = a[0];
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i] - r;
            }
            if (sum >= s) {
                System.out.println(r);
            } else {
                sum = s - sum;
                sum =(long) Math.ceil((double)sum/n);
                System.out.println(r-sum);
            }
        }
    }

}
