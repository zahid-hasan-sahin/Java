package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<Integer>();
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println((y-x)%(a+b)==0?(y-x)/(a+b):"-1");

        }

    }
}
