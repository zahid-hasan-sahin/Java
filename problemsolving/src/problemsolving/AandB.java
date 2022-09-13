package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class AandB {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sum = new ArrayList<Integer>();
        sum.add(0);
        for (int i = 1; i < 100000; i++) {
            sum.add((sum.get(i - 1)) + i);
        }
        System.out.println(sum);
        int n = scan.nextInt();

        while (n-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int ta = a;
            int i = 1;
            if (a > b) {
                while (!sum.contains(Math.abs(a - b))) {
                    
                }
            }
            System.out.println(ta);

        }
    }

}
