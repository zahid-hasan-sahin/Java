package NumberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class PowersOfTwo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int u = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (n > 0) {
            if (Math.pow(2, u) > n) {
                a.add((int) Math.pow(2, u - 1));
                n -= Math.pow(2, u - 1);
                u = 0;
            }
            ++u;
        }

        if (a.size() > k) {
            System.out.println("NO");
        } else {
            int i = 0;
            int y = k - a.size();
            while (y != 0 && i < a.size()) {
                if (i < a.size() && a.get(i) == 1) {
                    ++i;
                } else {
                    a.add(a.get(i) / 2);
                    a.set(i, a.get(i) / 2);
                   
                    --y;
                }
            }

            if (y == 0) {
                System.out.println("YES");
                for (int p : a) {
                    System.out.print(p + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }

    }

}
