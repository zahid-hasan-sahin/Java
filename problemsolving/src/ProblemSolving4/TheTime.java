package ProblemSolving4;

import java.util.Scanner;

public class TheTime {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String[] a = s.split(":", -1);
        int h = Integer.valueOf(a[0]);
        int m = Integer.valueOf(a[1]);
        int n = scan.nextInt();
        int k = h * 60 + m + n;
        int r = (k / 60) % 24;
        int e = k % 60;
        System.out.printf("%02d:%02d",r,e);
    }

}
