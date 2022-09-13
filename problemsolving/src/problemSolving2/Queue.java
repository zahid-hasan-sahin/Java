package problemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = scan.nextInt();
        }
        Arrays.sort(time);
        int overTime = 0;
        int res = 0;
        for (int i = 0; i < time.length; i++) {
            if (overTime <= time[i]) {
                ++res;
                overTime += time[i];
            }
        }
        System.out.println(res);

    }

}
