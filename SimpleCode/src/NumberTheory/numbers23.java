package NumberTheory;

import java.util.HashSet;
import java.util.Scanner;

public class numbers23 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        HashSet<Integer> h = new HashSet<Integer>();
        for (int j = 0; Math.pow(2, j) <= b; j++) {
            if (Math.pow(2, j) >= a && Math.pow(2, j) <= b) {
                h.add((int) Math.pow(2, j));
            }
            if (Math.pow(3, j) >= a && Math.pow(3, j) <= b) {
                h.add((int) Math.pow(3, j));
            }

        }
        for (int i = 0; Math.pow(2, i) <= b; i++) {
            for (int j = 0; Math.pow(3, j) <= b; j++) {
                if (Math.pow(3, j) * Math.pow(2, i) >= a && Math.pow(3, j) * Math.pow(2, i) <= b) {
                    h.add((int) Math.pow(3, j) * (int) Math.pow(2, i));
                }
            }

        }
        System.out.println(h.size());

    }
}
