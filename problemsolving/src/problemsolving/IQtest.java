package problemsolving;

import java.util.Scanner;

public class IQtest {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] val = new int[total];
        int e = 0;
        int o = 0;
        int er = 0;
        int or = 0;
        for (int i = 0; i < total; i++) {
            val[i] = scan.nextInt();
            if (val[i] % 2 == 0) {
                e++;
                er = i;
            } else {

                o++;
                or = i;
            }
        }
        if (e > o) {
            System.out.println(or + 1);
        } else {
            System.out.println(er + 1);
        }

    }

}
