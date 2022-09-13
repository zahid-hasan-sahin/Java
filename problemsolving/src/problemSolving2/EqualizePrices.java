package problemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizePrices {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] price = new int[n];
            int mx = 0;
            for (int i = 0; i < n; i++) {
                price[i] = scan.nextInt() + k;

            }
            Arrays.sort(price);
            System.out.println(price[0] >= price[price.length - 1] -(k*2)? price[0] : "-1");

        }

    }

}
