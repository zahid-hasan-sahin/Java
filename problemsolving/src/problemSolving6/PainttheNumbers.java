package problemSolving6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PainttheNumbers {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[j] % a[i] == 0) {
                    a[j] = a[i];
                }
            }
        }
        HashSet<Integer> ar = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            ar.add(a[i]);
        }
        System.out.println(ar.size());
    }

}
