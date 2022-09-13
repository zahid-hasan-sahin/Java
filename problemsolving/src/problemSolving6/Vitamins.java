package problemSolving6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vitamins {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> ab = new ArrayList<Integer>();
        ArrayList<Integer> ac = new ArrayList<Integer>();
        ArrayList<Integer> bc = new ArrayList<Integer>();
        ArrayList<Integer> abc = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {

            int in = scan.nextInt();
            String s = scan.next();
            char[] k = s.toCharArray();
            Arrays.sort(k);

            s = String.valueOf(k).toLowerCase();

            if (s.equals("a")) {
                a.add(in);
            }
            if (s.equals("b")) {
                b.add(in);
            }
            if (s.equals("c")) {
                c.add(in);
            }
            if (s.equals("ab")) {
                ab.add(in);
            }
            if (s.equals("ac")) {
                ac.add(in);
            }
            if (s.equals("bc")) {
                bc.add(in);
            }
            if (s.equals("abc")) {
                abc.add(in);
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);
        Collections.sort(ab);
        Collections.sort(ac);
        Collections.sort(bc);
        Collections.sort(abc);

        int res = 1000000000;
        if (a.size() > 0 && b.size() > 0 && c.size() > 0) {
            res = Math.min(res, a.get(0) + b.get(0) + c.get(0));
        }
        if (a.size() > 0 && bc.size() > 0) {
            res = Math.min(res, a.get(0) + bc.get(0));
        }
        if (b.size() > 0 && ac.size() > 0) {
            res = Math.min(res, b.get(0) + ac.get(0));
        }
        if (c.size() > 0 && ab.size() > 0) {
            res = Math.min(res, c.get(0) + ab.get(0));
        }
        if (ab.size() > 0 && bc.size() > 0) {
            res = Math.min(res, ab.get(0) + bc.get(0));
        }
        if (ab.size() > 0 && ac.size() > 0) {
            res = Math.min(res, ab.get(0) + ac.get(0));
        }
        if (ac.size() > 0 && bc.size() > 0) {
            res = Math.min(res, ac.get(0) + bc.get(0));
        }
        
        if (abc.size() > 0) {
            res = Math.min(res, abc.get(0));
        }
        if (res == 1000000000) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }

    }

}
