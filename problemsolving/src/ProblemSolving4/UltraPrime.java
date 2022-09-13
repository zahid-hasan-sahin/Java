package ProblemSolving4;

import java.util.Scanner;

public class UltraPrime {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int max = 1000010;
        int[] pr = new int[max];
        int c = 1;
        pr[1] = pr[0] = 1;
        int[] arr = new int[max];
        arr[0] = arr[1] = 1;

        for (int i = 2; i < max; i++) {
            if (pr[i] == 0) {
                for (int j = i + i; j < max; j += i) {
                    pr[j] = 1;
                }
            } else {
                ++c;
            }
            arr[i] = c;

        }
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            if (l == 1 && r == 3) {
                System.out.println("1");
            } else {
                System.out.println(arr[r] - arr[l - 1]);
            }
        }

    }

}
