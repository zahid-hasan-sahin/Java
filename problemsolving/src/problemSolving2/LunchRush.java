package problemSolving2;

import java.util.Scanner;

public class LunchRush {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numOfRes = scan.nextInt();
        int givenTime = scan.nextInt();
        int res = -1000000000;
        for (int i = 0; i < numOfRes; i++) {
            int f = scan.nextInt();
            int t = scan.nextInt();
            if (t > givenTime) {
                if (res <= f - Math.abs(t - givenTime)) {
                    res = f - Math.abs(t - givenTime);

                }
            } else {
                res = Math.max(f, res);
            }
        }
        System.out.println(res);
    }

}
