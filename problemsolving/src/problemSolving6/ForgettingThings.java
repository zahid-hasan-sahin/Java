package problemSolving6;

import java.util.Scanner;

public class ForgettingThings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 9 && b == 1) {
            System.out.println(9 + " " + 10);
        } else if (a == b) {
            System.out.println(a + "0 " + b + "1");
        } else if (a + 1 == b) {
            System.out.println(a + " " + b);
        }else{
            System.out.println("-1");
        }
    }

}
