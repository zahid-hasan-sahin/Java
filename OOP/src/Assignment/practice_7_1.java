package Assignment;

import java.util.Scanner;

public class practice_7_1 {

    static int sum(int[] a, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers, one per line:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int s = sum(a, n);
        System.out.println("The sum is " + s);
        for (int i = 0; i < a.length; i++) {
            double r = ((a[i] / (double) s)) * 100;
            System.out.println(a[i] + ", which is " + r + "% of the sum.");
        }
    }
}
