package dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WordBreak {

    static HashMap<String, Boolean> h = new HashMap<String, Boolean>();

    static boolean usingRec(HashSet<String> a, String s) {
        int k = s.length();
        if (k == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (!h.containsKey(s.substring(i))) {
                boolean b = usingRec(a, s.substring(i));
                h.put(s.substring(i), b);
            }
            if (a.contains(s.substring(0, i)) && h.get(s.substring(i))) {

                return true;
            }
        }

        return false;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            h.clear();
            int n = scan.nextInt();
            HashSet<String> a = new HashSet<String>();
            for (int i = 0; i < n; i++) {
                a.add(scan.next());
            }
            String s = scan.next();
            if (usingRec(a, s)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

}
