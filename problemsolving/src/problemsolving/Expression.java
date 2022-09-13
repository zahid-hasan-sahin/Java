package problemsolving;

import java.util.Scanner;

public class Expression {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = scan.nextInt();
        }
        int a = num[0] + num[1] * num[2];
        int b = num[0] * (num[1] + num[2]);
        int c = (num[0] * num[1] * num[2]);
        int d = (num[0] + num[1]) * num[2];
        int e = num[0] + num[1] + num[2] ;
        int f = (num[0] * num[1]) + num[2];
        if (a > b && a > c && a > d && a > d && a>f) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d && b >= e && b >= f) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d && c >= e && c >=f) {
            System.out.println(c);
        } else if(d >= a && d >= b && d >= c && d >= e && d >= f) {
            System.out.println(d);
        }
        else if(e >= a && e>= b && e >= c && e >= d && e >= f) {
            System.out.println(e);
        }else{
            System.out.println(f);
        }

    }

}
