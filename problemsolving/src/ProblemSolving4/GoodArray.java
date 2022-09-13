package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long sum = 0;
        int[] b = new int[1000010];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            ++b[in];
            a[i] = in;
            sum += in;
        }
        ArrayList<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int u = 0;
            if ((sum - a[i]) / 2 <= 1000005 && ((sum - a[i]) / 2) == a[i]) {
                u = b[(int) ((sum - a[i]) / 2)] - 1;
            } else if ((sum - a[i]) / 2 <= 1000005) {
                u = b[(int) ((sum - a[i]) / 2)];
            }
            if ((sum - a[i]) % 2 == 0 && u >= 1) {
                r.add(i + 1);
            }
        }
        System.out.println(r.size());
        for (int i = 0; i < r.size(); i++) {
            System.out.print(r.get(i) + " ");
        }
        System.out.println();
    }

}
