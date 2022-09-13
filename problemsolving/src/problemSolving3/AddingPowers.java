package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class AddingPowers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            long mx = 0;

            ArrayList<Long> arra = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                long in = scan.nextLong();

                if (in != 0) {
                    arra.add(in);
                }
                mx = Math.max(mx, in);

            }

            Collections.sort(arra);
            LinkedList<Long> p = new LinkedList<Long>();
            int j = 0;
            while (Math.pow(m, j) <= mx) {
                p.add((long) Math.pow(m, j));
                ++j;
            }
            Collections.sort(p, Collections.reverseOrder());

            int e = arra.size();
            boolean b = false;
            int res = 0;
            for (int i = 0; i < e; i++) {
                long s = 0;
                j = 0;
                while (true) {
                    try {
                        if (s + p.get(j) > arra.get(i)) {
                            ++j;
                        } else if (s == arra.get(i)) {
                            ++j;
                            p.remove(p.get(j));
                            break;
                        } else if (s + p.get(j) <= arra.get(i)) {

                            s += p.get(j);
                            p.remove(p.get(j));

                            if (s == arra.get(i)) {
                                ++res;
                                break;

                            }

                        }
                    } catch (Exception q) {
                        b = true;
                        break;
                    }

                }
                if (b) {
                    break;
                }
            }
            if (res == e) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
