package problemsolving;

import java.util.Scanner;

public class EpicGame {

    static int gcd(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 0;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int res = 0;
        while (n!=0) {
            if (res % 2 == 0) {
                n = n - gcd(a,n);
                    ++res;
            }else{
                n = n - gcd(b,n);
                ++res;
            }
        }
        if(res%2==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
