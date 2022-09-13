package problemSolving3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Fruits {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> price = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            price.add(scan.nextInt());
        }
        HashMap<String, Integer> s = new HashMap<String, Integer>();
        for (int i = 0; i < m; i++) {
            String in = scan.next();
            if (s.get(in) == null) {
                s.put(in, 1);
            } else {
                int temp = s.get(in) + 1;
                s.put(in, temp);
            }

        }
        Collection<Integer> values = s.values();

        ArrayList<Integer> listEl = new ArrayList<Integer>(values);
        Collections.sort(listEl, Collections.reverseOrder());
        Collections.sort(price);
        int u = listEl.size();
        int minRes = 0;
        int maxRes = 0;

        for (int i = 0; i < u; i++) {
            minRes += (listEl.get(i) * price.get(i));
        }

        Collections.sort(price, Collections.reverseOrder());
        Collections.sort(listEl, Collections.reverseOrder());
        for (int i = 0; i < u; i++) {
            maxRes += (listEl.get(i) * price.get(i));
        }
        System.out.println(minRes + " " + maxRes);

    }

}
