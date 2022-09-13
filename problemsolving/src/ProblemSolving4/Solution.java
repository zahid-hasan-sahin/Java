package ProblemSolving4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    static class store {

        int total;
        String s;
    }

    public static class mycom implements Comparator<store> {

        @Override
        public int compare(store ob1, store ob2) {
            int f = ob1.total;
            int l = ob2.total;
            return f <= l ? 1 : -1;

        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Solution.store[] ob = new Solution.store[t];
        for (int i = 0; i < t; i++) {
            ob[i] = new store();
        }
        scan.nextLine();
        int q = 0;
        while (t-- > 0) {
            String s = scan.nextLine();
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                    ++c;
                }
            }
            ob[q].s = s;
            ob[q].total = c;
            ++q;
        }
        Arrays.sort(ob, new mycom());
        for (int i = 0; i < q; i++) {
            System.out.println(ob[i].s);
        }

    }
}
