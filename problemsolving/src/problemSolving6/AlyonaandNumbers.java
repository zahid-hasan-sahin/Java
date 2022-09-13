package problemSolving6;

import java.util.Scanner;

public class AlyonaandNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long m = scan.nextInt();
        long[] a = new long[5];

        a[0] = n / 5;
        a[1] = (n + 4) / 5;
        a[2] = (n + 3) / 5;
        a[3] = (n + 2) / 5;
        a[4] = (n + 1) / 5;
        long[] b = new long[5];

        b[0] = m / 5;
        b[1] = (m + 4) / 5;
        b[2] = (m + 3) / 5;
        b[3] = (m + 2) / 5;
        b[4] = (m + 1) / 5;
  
        long res = (a[1] * b[4]) + (a[2] * b[3]) + (a[3] * b[2]) + (a[4] * b[1] + (a[0] * b[0]));
        System.out.println(res);
    }

}
