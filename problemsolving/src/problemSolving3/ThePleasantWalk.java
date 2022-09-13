package problemSolving3;

import java.util.Scanner;

public class ThePleasantWalk {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int mx = 1;
        int counter = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ++counter;
            } else {
                mx = Math.max(mx, counter);
                counter = 1;
            }
        }
        
            System.out.println(Math.max(mx, counter));
        

    }

}
