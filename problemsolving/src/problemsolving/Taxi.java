package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Taxi {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int grp = scan.nextInt();
        ArrayList<Integer> st = new ArrayList<Integer>();
        for (int i = 0; i < grp; i++) {
            st.add(scan.nextInt());
        }
        Collections.sort(st);
        int c = 0;
        for (int i = grp - 1; i > 0; i--) {
            while (st.get(i) + st.get(0) <= 4) {
                st.set(i, st.get(i) + st.get(0));
                st.remove(0);
                c++;
                i = i - 1;
                if (i < 1) {
                    break;
                }
            }
        }
        System.out.println(grp - c == 0 ? 1 : grp - c);
    }
}
