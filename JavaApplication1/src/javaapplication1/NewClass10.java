package javaapplication1;

import java.util.*;

public class NewClass10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int d = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int best = n;
            for (int j = 0; j <= n-d; j++) {
                HashSet<Integer> set = new HashSet<>();
                for (int c = j; c < j + d; c++) {
                    set.add(arr[c]);
                }
                best = Math.min(best, set.size());
            }
            System.out.println(best);
        }
    }
}
