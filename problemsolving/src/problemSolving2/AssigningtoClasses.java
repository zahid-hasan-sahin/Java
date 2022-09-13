package problemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class AssigningtoClasses {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int res = Integer.MAX_VALUE;
            int[] k = new int[n*2];
            for (int i = 0; i < n*2; i++) {
                k[i] = scan.nextInt();
            }
            Arrays.sort(k); 
            System.out.println(k[n]-k[n-1]);
        }

    }

}
