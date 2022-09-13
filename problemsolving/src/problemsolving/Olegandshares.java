package problemsolving;

import java.util.Scanner;

public class Olegandshares {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] price = new int[n];
        price[0] = scan.nextInt();
        int min = price[0];

        int ch = 1;
        for (int i = 1; i < n; i++) {
            price[i] = scan.nextInt();
            if (price[i] < min) {
                min = price[i];
            }
        }
        int rdiv = (price[0] - min) % k == 0 ? 1 : 0;

        for (int i = 1; i < n; i++) {
            if ((price[i] - min) % k == 0) {
                ++rdiv;
            }
            if (price[i] == price[i - 1]) {
                ++ch;
            }

        }
        if (rdiv != n && ch != n) {
            System.out.println("-1");
        } else {
            long res = 0;
            for (int i = 0; i < n; i++) {
                res = res + ((price[i] - min) / k);
            }
            System.out.println(res);
        }

    }

}
