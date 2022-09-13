package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AandBandCompilationErrorsv {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            b.add(scan.nextInt());
        }
        for (int i = 0; i < n - 2; i++) {
            c.add(scan.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);
        int ab = 0;
        int bc = 0;
        int bcr = 0;
        for (int i = 0; i < c.size(); i++) {
            if (!a.get(i).equals(b.get(i)) && ab == 0) {
                System.out.println(a.get(i));

                ++ab;
            }
            if (!b.get(i).equals(c.get(i)) && bc == 0) {
                bcr = i;
                ++bc;
            }
            if (ab == 1 && bc == 1) {
                break;
            }
        }

        if (ab == 0 && !a.get(a.size() - 2).equals(b.get(b.size() - 1))) {
            System.out.println(a.get(a.size() - 2));
            ++ab;
        }
        if (ab == 0 && !a.get(a.size() - 1).equals(b.get(b.size() - 1))) {
            System.out.println(a.get(a.size() - 1));
            ++ab;
        }
        if (ab == 0) {
            System.out.println(a.get(a.size() - 3));
        }
        if (bc > 0) {
            System.out.println(b.get(bcr));
        } else {
            System.out.println(b.get(b.size() - 1));

        }

    }
}
