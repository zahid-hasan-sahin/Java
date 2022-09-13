package Exception;

import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        long c = 0;
        int k = 0;
        boolean b = false;
        int[] arra = new int[n];
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            arra[i] = in;
            if (in == x) {
                b = true;
            }
        }
        if (b) {
            int u = 0;
            for (int i = 0; i < n; i++) {
                if (arra[i] < x) {
                    ++u;
                }
            }
            System.out.println(u);
        } else {
            
        }

    }

}
