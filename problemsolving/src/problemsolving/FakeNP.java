package problemsolving;

import java.util.Scanner;

public class FakeNP {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (m == n) {
            System.out.println(m);
        } else {
            System.out.println(2);
        }
    }
}
