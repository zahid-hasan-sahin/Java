package lightOj;

import java.util.Scanner;

public class DigitsofFactorial {

    static double log(int n, int b) {
        return (Math.log(n) / Math.log(b));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        double[] arr = new double[1000010];
        arr[1] = log(1, 10);
        for (int i = 2; i < 1000010; i++) {
            arr[i] = arr[i - 1] +  Math.log10(i);
        }
        while (q-- > 0) {
            int n = scan.nextInt();
            int b = scan.nextInt();
            System.out.print("Case " + t++ + ": ");
            System.out.println((long)Math.floor(arr[n] / Math.log10(b)) + 1);

        }

    }

}
