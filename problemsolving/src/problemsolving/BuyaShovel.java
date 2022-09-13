package problemsolving;

import java.util.Scanner;

public class BuyaShovel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int r = scan.nextInt();
        int res = 0;
        int temp = k;
        if (k == r) {
            System.out.println(++res);
        } else {
            while (k % 10 != r && k % 10 != 0) {
                ++res;
                k = k + temp;
            }
            System.out.println(++res);

        }
    }
}
