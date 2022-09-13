package problemSolving6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n * 2 + 10];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                ++b[a[i]];
            }
            if (n == 1) {
                System.out.println("1");
                continue;
            }
            Arrays.sort(a);

            for (int i = n - 1; i >= 0; i--) {
                if (b[a[i] + 1] == 0) {
                    --b[a[i]];
                    ++b[a[i]+1];
                    ++a[i];
                    
                }
            }

            HashSet<Integer> k = new HashSet<Integer>();;

            for (int i = 0; i < n; i++) {
              //  System.out.println(a[i]);
                k.add(a[i]);
            }

            System.out.println(k.size());
        }
    }

}
