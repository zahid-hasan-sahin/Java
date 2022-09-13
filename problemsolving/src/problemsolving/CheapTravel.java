package problemsolving;

import java.util.Scanner;

public class CheapTravel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (Math.floor((double)b / m) < a) {
            System.out.println(((n / m) * b) +(((n%m)*a)>b?b:((n%m)*a)));
        } else {
            System.out.println(n * a);
        }
    }
}
