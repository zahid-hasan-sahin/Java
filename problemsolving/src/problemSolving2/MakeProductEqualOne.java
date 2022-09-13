package problemSolving2;

import java.util.Scanner;

public class MakeProductEqualOne {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 0;
        int countNeg = 0;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in < 0) {
                ++countNeg;
            } else if (in ==0) {
                 ++countZero;
                 break;
            }
            res += Math.abs(in-1);
        }
        System.out.println(countNeg%2==0?res+countZero:res+(2-countZero));

    }

}
