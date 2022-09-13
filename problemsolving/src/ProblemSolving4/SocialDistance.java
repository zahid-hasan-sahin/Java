package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialDistance {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int r = 0;

            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    a.add(i);
                }
            }
            if (a.size() == 0) {
                if (n >= k * 2 ) {
                    r += 2;
                } else {
                    ++r;
                }
                a.add(0);
                a.add(n - 1);
            } else {
                if (a.get(0) > k) {
                    ++r;
                }
                if (n - (a.get(a.size() - 1) + 1) > k) {
                    ++r;
                    a.add(n-1);
                }
            }
            for (int i = 0; i < a.size() - 1; i++) {
                if (a.get(i + 1) - a.get(i) > k * 2 + 1) {
                    r += ((a.get(i + 1) - a.get(i)) / (k * 2 + 1));
                }
            }
         sb.append(r+"\n");

        }
        System.out.println(sb);
    }

}
