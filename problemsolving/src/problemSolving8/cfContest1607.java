package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1607 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = b % 4;
            long k = (b / 4) * 4 + 1;
            long res = a;
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i < c; i++) {
                if (i == 0 || i == 3) {
                    sum1 += k++;
                } else {
                    sum2 += k++;
                }
            }
            if (a % 2 == 0) {
                System.out.println(res-sum1+sum2);
            }else{
                 System.out.println(res+sum1-sum2);
            }
        }

    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        