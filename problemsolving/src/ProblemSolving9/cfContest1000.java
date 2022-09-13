package ProblemSolving9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1000 {

    static int log(int k) {
        String e = String.valueOf(k);
        return e.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            HashMap<Integer, St> p = new HashMap<Integer, St>();
            HashMap<Integer, St> q = new HashMap<Integer, St>();
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                if (p.containsKey(log(x))) {
                    p.put(log(x), new St());
                } else {
                    St s = p.get(log(x));
                    s.add(log(x));
                    p.put(log(x), s);
                }
            }
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                if (q.containsKey(log(x))) {
                    q.put(log(x), new St());
                } else {
                    St s = q.get(log(x));
                    s.add(log(x));
                    q.put(log(x), s);
                }

            }
            ArrayList<Integer> r = new ArrayList<Integer>();

            for (int i : p.keySet()) {
                if (q.containsKey(i)) {
                    ArrayList<Integer> x = p.get(i).ar;
                    ArrayList<Integer> y = q.get(i).ar;
                    if (x.size() != y.size()) {
                        for (int j = 0; j < Math.abs(x.size() - y.size()); j++) {
                            r.add(x.get(0));
                        }
                    }
                }

            }

            int c = 0;
            for (int i = 0; i < a.size(); i++) {
                int x = a.get(i);
                int y = b.get(i);

                while (y != x) {
                    if (y < x) {
                        x = log(x);
                    } else {
                        y = log(y);
                    }
                    ++c;
                }
            }
            System.out.println(c);
        }

    }
}

class St {

    ArrayList<Integer> ar = new ArrayList<Integer>();

    void add(int k) {
        ar.add(k);

    }
}
