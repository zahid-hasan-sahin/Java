package problemSolving3;

import java.util.Arrays;
import java.util.Scanner;

public class SweetsEating {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] testy = new int[n];
        for (int i = 0; i < n; i++) {
            testy[i] = scan.nextInt();
        }

        Arrays.sort(testy);
        for (int i = 0; i < n; i++) {
            System.out.print(testy[i] + " ");
        }
        System.out.println();

    }
}
