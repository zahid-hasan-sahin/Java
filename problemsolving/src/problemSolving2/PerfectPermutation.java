package problemSolving2;

import java.util.Scanner;

public class PerfectPermutation {

    static void swip(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.print(a+" ");
        System.out.print(b+" ");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 1) {
            System.out.println("-1");
        } else {
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = i + 1;
            }

            for (int i = 0; i < n; i+=2) {
                swip(temp[i], temp[i + 1]);
            }
        }
        System.out.println();
    }
    
}
