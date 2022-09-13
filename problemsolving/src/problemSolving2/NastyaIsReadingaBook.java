package problemSolving2;

import java.util.Scanner;

public class NastyaIsReadingaBook {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int start[] = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = scan.nextInt();
            end[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int i = 0;
        for (i = i; i < n; i++) {
            if (end[i] >= k) {
                break;
            }
        }
        System.out.println(n - i);

    }

}
