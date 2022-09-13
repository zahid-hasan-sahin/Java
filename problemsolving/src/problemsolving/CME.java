package problemsolving;

import java.util.Scanner;

public class CME {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int n = scan.nextInt();
            if (n < 4) {
                System.out.println(4-n);
            } else if (n % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }

}
