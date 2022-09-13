package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class VanyaandFence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            array.add(scan.nextInt());

        }
        int b = scan.nextInt();
        for (int i = 0; i < b; i++) {
            array.add(scan.nextInt());
        }
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (array.contains(i)) {

            } else {
                temp++;
                break;
            }

        }
        if (temp == 0) {
            System.out.println("I become the guy.");

        } else {
            System.out.println("Oh, my keyboard!");
        }

    }

}
