package problemsolving;

import java.util.Scanner;

public class CutRibbon {

    public static int middleOfThree(int a, int b, int c) {

        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return b;
        } else if ((b < a && a < c) || (c < a && a < b)) {
            return a;
        } else {
            return c;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int i = 1;
        int max = 0;
        int mid = 0;
        int min = Math.min(a, Math.min(b, c));
        int res = 0;
        if (n % min == 0) {
            System.out.println(n / min);
        } else {

            while (true) {
                int temp = n - (min * i);
                   //    System.out.println("t="+temp);
                max = temp % Math.max(a, Math.max(b, c));
                mid = temp % middleOfThree(a, b, c);
                if (max == 0 || mid == 0) {
                    if (max == 0) {
                        res = Math.max(a, Math.max(a, c));

                    } else {
                        res = middleOfThree(a, b, c);
                    }
                    break;
                } else {
                    ++i;
                }
            }
            System.out.println(i);
            System.out.println(min);
            System.out.println(res);
            System.out.println(((n - (min * i)) / res) + ((n -res ) / min));
        }

    }

}
