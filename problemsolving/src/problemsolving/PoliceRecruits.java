package problemsolving;

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] val = new int[total];
        int sum = 0;
        int c = 0;
        int r = 0;
        int res = 0;
        for (int i = 0; i < total; i++) {
            val[i] = scan.nextInt();
        }
        for (int i = 0; i < total; i++) {

            if (val[i] == -1) {
                if (sum - 1 < 0) {
                    c++;
                } else {
                    sum = sum - 1;
                }
            } else {
                sum = sum + val[i];
            }

        }
        System.out.println(c);

    }

}
