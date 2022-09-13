package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class StrangeFunction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        k:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    continue k;
                }
            }
            a.add(i);
        }
        int t = scan.nextInt();
        while (t-- > 0) {
           long n = scan.nextLong();

        }
    }

}
