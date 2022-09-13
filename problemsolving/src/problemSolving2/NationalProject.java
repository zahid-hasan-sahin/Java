package problemSolving2;

import java.util.Scanner;

public class NationalProject {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long temp = (long) Math.ceil(n / 2.0);
            if (a >= b) {

                System.out.println(n);
            } else {
                long r = 0;
                long res = 0;
                if (temp <= a) {
                    System.out.println(n);
                } else {                   
                    long u =  temp/a==temp?temp-1:temp/a;
                    System.out.println(((a+b)*u)+(temp%a==0?1:temp%a) );
                    
                }
            }

        }
    }

}
