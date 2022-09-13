package ProblemSolving5;

import java.util.Scanner;

public class GeorgeandSleep {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.next().split(":", -1);
        String[] b = scan.next().split(":", -1);
        int p = Integer.valueOf(a[0]);
        int q = Integer.valueOf(b[0]);
        int k = Integer.valueOf(a[1]);
        int e = Integer.valueOf(b[1]);
        int h = p - q;
        int m = k - e;
        if(m<0){
            m +=60;
            --h;
        }
        if(h<0){
            h +=24;
        }
        System.out.printf("%02d:%02d", h,m);
        System.out.println();
    }

}
