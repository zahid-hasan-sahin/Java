package problemSolving2;

import java.util.Scanner;

public class InfinitePrefixes {

    static int countChar(String str,int t) {
        int zero = 0;
        int one = 0;
        int c = 0;
        int n = 10000000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }
            if(zero-t==one){
                c++;
            }
        }
        int repititions = n / str.length();
        zero = zero * repititions;
        one = one * repititions;
        for (int i = 0;
                i < n % str.length(); i++) {
            if (str.charAt(i) == '0') {
                zero++;
            }else {
                ++one;
            }
            if(zero-t==one){
                c++;
            }
        }

        return c;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while(total-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            String s = scan.next();
            System.out.println(countChar(s,x));
        }

    }
}
