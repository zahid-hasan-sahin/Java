package problemSolving6;

import java.util.Scanner;

public class Palindromifier {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(3);
        int n = s.length();
        System.out.println("L " + (n - 1));
        System.out.println("R " + 2);
        int p = (n - 2);
        p += n;
        p = p + (p - 2);
        System.out.println("R " + (p - 1));
    }

}
