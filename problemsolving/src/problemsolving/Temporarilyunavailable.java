package problemsolving;

import java.util.Scanner;

public class Temporarilyunavailable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int r = scan.nextInt();
            int t1 = (c + r);
            int t2 = (c - r);
            int t3 = Math.abs((a - b)) + 1;
            if ((t1 >= a) && (t1 <= b) || ((t1 <= a) && t1 >= b)) {
                t3 = Math.abs(a - b) - ((t1 - c)+(t1-Math.abs(a-b)>0?t1-Math.abs(a-b):0));
            }
            if ((t2 >= a) && (t2 <= b) || ((t2 <= a) && t2 >= b)) {
            //    System.out.println(t3);
                t3 = t3 - ((c - t2)-Math.min(a, b));
           //     System.out.println(t2);
            }
            System.out.println(t3);

        }

    }

}
