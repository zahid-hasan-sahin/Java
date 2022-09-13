package ProblemSolving7;

import java.util.Scanner;

public class RedBlueShuffle {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            String p = scan.next();
            char[] a = s.toCharArray();
            char[] b = p.toCharArray();
            int re = 0;
            int bl = 0;
            for (int i = 0; i < n; i++) {
                
                if (a[i] > b[i]) {
                    ++re;
                } else if (b[i] > a[i]) {
                    ++bl;
                }
            }
            if (re > bl) {
                System.out.println("RED");
            } else if (bl > re) {
                System.out.println("BLUE");
            } else {
                System.out.println("EQUAL");
            }
        }
    }

}
