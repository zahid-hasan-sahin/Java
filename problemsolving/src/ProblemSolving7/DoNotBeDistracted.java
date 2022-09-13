package ProblemSolving7;

import java.util.Scanner;

public class DoNotBeDistracted {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int[] a = new int[26];
            ++a[s.charAt(0) - 'A'];
            for (int i = 1; i < s.length(); i++) {
                if (a[s.charAt(i) - 'A'] != 0 && s.charAt(i) != s.charAt(i - 1)) {
                    System.out.println("NO");
                    continue k;
                }
                ++a[s.charAt(i) - 'A'];
            }
            System.out.println("YES");
        }

    }

}
