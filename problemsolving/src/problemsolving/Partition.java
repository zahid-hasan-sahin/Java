package problemsolving;

import java.util.Scanner;

public class Partition {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] val = new int[total];
        for (int i = 0; i < total; i++) {
            int in = scan.nextInt();
            if (in < 0) {
                in = -in;
            }
            val[i] = in;
        }
        int sum = 0;
        for (int res : val) {
            sum = sum + res;
        }
        System.out.println(sum);

    }

}
