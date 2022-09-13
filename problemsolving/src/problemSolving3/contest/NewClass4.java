package problemSolving3;

import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a > b) {
                int k = a / b;
                if (k * b == a) {
                    System.out.println(0);
                } else {
                    System.out.println((k * b + b) - a);
                }

            } else {
                System.out.println(b - a);
            }
        }

    }

}
