package ProblemSolving5;

import java.util.HashMap;
import java.util.Scanner;

public class LongestKuniquecharacterssubstring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            String s = scan.next();
            int n = s.length();
            int k = scan.nextInt();
            HashMap<Character, Integer> h = new HashMap<Character, Integer>();
            int w = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (h.size() > k) {
                    res = Math.max(res, h.size());
                    h.put(s.charAt(w), h.get(s.charAt(w)) - 1);
                    if (h.get(s.charAt(w)) == 0) {
                        h.remove(h.get(w));
                    }
                    ++w;
                } else {
                    if (h.get(s.charAt(i)) == null) {
                        h.put(s.charAt(i), 1);
                    } else {
                        h.put(s.charAt(i), h.get(s.charAt(i) + 1));
                    }
                }
            }
            System.out.println(res);
        }
    }

}
