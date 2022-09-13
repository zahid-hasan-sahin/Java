package ProblemSolving5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Mikeandstrings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        String sb = scan.next();
        int n = sb.length();
        h.put(sb, 0);

        for (int i = 0; i < n - 1; i++) {
            char k = sb.charAt(0);
            sb = sb.substring(1);
            sb += k;
            if (!h.containsKey(sb)) {
                h.put(sb, i + 1);
            }

        }

        while (t-- > 1) {
            String s = scan.next();
            HashSet<String> a = new HashSet<String>();
            n = s.length();
            if (!h.containsKey(s)) {
                System.out.println("-1");
                return;
            }
            a.add(s);
            for (int i = 0; i < n - 1; i++) {
                char k = s.charAt(0);
                s = s.substring(1);
                s += k;
                if (!a.contains(s)) {
                    if (!h.containsKey(s)) {
                        System.out.println("-1");
                        return;
                    } else {
                        int u = h.get(s) + (i + 1);

                        h.put(s, u);
                    }
                }
                a.add(s);
            }

        }
        int res = 1111111111;
        for (Integer v : h.values()) {

            res = Math.min(res, v);
        }
        System.out.println(res);

    }
}
