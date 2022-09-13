package problemsolving;

import java.util.Scanner;

public class Dominopiling {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int r = (h * w) / 2;
        System.out.println(r);

    }

}
