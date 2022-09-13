package problemsolving;

import java.util.Scanner;

public class XeniaandRingroad {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long temp = 1;
        long res = 0;
        for (long i = 0; i <m; i++) {
            int in = scan.nextInt();
            if(temp<=in){
                res = res + (in-temp);
            }else if(temp>in){
                res = res + (n-temp+in);
            }
            temp = in;
                     
        }
        System.out.println(res);
    }
}
