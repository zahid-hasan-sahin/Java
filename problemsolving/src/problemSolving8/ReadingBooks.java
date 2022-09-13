package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReadingBooks {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> both = new ArrayList<Integer>();
        ArrayList<Integer> alice = new ArrayList<Integer>();
        ArrayList<Integer> bob = new ArrayList<Integer>();
        int t1 = 0;
        int t2 = 0;
        for (int i = 0; i < n; i++) {
            int am = scan.nextInt();
            int al = scan.nextInt();
            int bo = scan.nextInt();
            t1 += al;
            t2 += bo;
            if (al == 1 && bo == 1) {
                both.add(am);
            }
            if (al == 1 && bo == 0) {
                alice.add(am);
            }
            if (al == 0 && bo == 1) {
                bob.add(am);
            }
        }

        if (t1 < k || t2 < k) {
            System.out.println("-1");
            return;
        }
        Collections.sort(both);
        Collections.sort(alice);
        Collections.sort(bob);
        long res = 0;
        ArrayList<Integer> bothC = new ArrayList<Integer>();
        for (int i = 0; i < Math.min(k, both.size()); i++) {
            if (k == i) {
                break;
            }
            bothC.add(both.get(i));
            res += both.get(i);
        }
        int aliceI = 0;
        int bobI = 0;
        int p = 0;

        for (int i = bothC.size(); i < k; i++) {

            res += alice.get(p++);
            aliceI++;
        }
        p = 0;
        for (int i = bothC.size(); i < k; i++) {
            res += bob.get(p++);
            ++bobI;
        }
        for (int i = bothC.size() - 1; i >= 0; i--) {
            if (alice.size() <= aliceI || bobI >= bob.size()) {
                break;
            }
            if (alice.get(aliceI) + bob.get(bobI) <= bothC.get(i)) {
                res -= bothC.get(i);
                res += alice.get(aliceI);
                res += bob.get(bobI);
            } else {
                break;
            }
            ++aliceI;
            ++bobI;
        }
        System.out.println(res);
    }

}
