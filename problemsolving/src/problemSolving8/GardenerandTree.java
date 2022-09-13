package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class GardenerandTree {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            ArrayList<Integer> diff = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (a[i] == a[j]) {
                        continue;
                    }
                    diff.add(Math.abs(a[i] - a[j]));
                }
            }
            
        }
    }

}
