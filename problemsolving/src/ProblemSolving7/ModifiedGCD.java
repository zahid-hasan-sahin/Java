package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifiedGCD {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        ArrayList<Integer> ad = new ArrayList<Integer>();
        ArrayList<Integer> bd = new ArrayList<Integer>();
        int ta = a;
        int tb = b;
        for (long i = 2; i * i <= ta; i++) {
            while (ta % i == 0) {
                ad.add((int) i);
                ta /= i;
            }
        }
        if (ta >= 2) {
            ad.add(ta);
        }
        for (long i = 2; i * i <= tb; i++) {
            while (tb % i == 0) {
                bd.add((int) i);
                tb /= i;
            }
        }
        if (tb >= 2) {
            bd.add(tb);
        }
        ArrayList<Integer> cm = new ArrayList<Integer>();
        for (int i = 0; i < ad.size(); i++) {
            for (int j = 0; j < bd.size(); j++) {
                if (ad.get(i) == bd.get(j)) {
                    cm.add(ad.get(i));
                    ad.remove((int) i);
                    bd.remove((int) j);
                }
            }
        }

    }

}
