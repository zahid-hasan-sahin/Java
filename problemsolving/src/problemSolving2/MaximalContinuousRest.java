package problemSolving2;

import java.util.Scanner;

public class MaximalContinuousRest {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] working = new int[n * 2];
        int restHours = 0;
        for (int i = 0; i < n; i++) {
            working[i] = scan.nextInt();
            working[i + n] = working[i];
        }
        int res = 0;
        for (int i = 0; i < n * 2; i++) {
            if (working[i] == 1) {
                restHours++;
                if (restHours > res) {
                    res = restHours;

                }
            } else {

                restHours = 0;
            }

        }
        System.out.println(res);

    }
}
