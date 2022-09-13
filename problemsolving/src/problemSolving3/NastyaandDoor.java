package problemSolving3;

import java.util.Scanner;

public class NastyaandDoor {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int l = 1;
            int r = 0;
            for (int i = 1; i < k - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    ++r;
                }
            }
            int mx = r;
            for (int i = k; i < n; i++) {
                if (arr[i] > arr[i - 1]) {
                    ++r;
                }
                if (arr[i - k] < arr[(i - k) + 1]) {
                    --r;
                    System.out.println(i - k);
                }

            }
            System.out.println(mx + " " + l);

        }

    }

}
