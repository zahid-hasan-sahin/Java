package ProblemSolving4;

import java.util.Scanner;

public class NewClass7 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int mx = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                mx = Math.max(mx, a[i]);
            }
            String s = "";
            mx += 5;
            for (int i = 0; i < mx; i++) {
                s += "a";
            }
            System.out.println(s);
            String res = "";

            for (int i = 0; i < n; i++) {
                int j = 0;
                for (j = 0; j < a[i]; j++) {
                    res += s.charAt(j);
                }
                res = res + (char) ((s.charAt(j) - 'a' + 1) % 26 + 'a');
                for (j = j + 1; j < mx; j++) {
                    res += s.charAt(j);
                }
                System.out.println(res);
                s = res;
                res = "";;
            }

        }

    }

}
