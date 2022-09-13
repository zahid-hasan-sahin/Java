package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterSwap {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        a:
        while (t-- > 0) {
            int n = scan.nextInt();
            String a = scan.next();
            String b = scan.next();
            char[] aa = new char[2];
            char[] ab = new char[2];
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (c >= 2) {
                        System.out.println("No");
                        continue a;
                    }

                    aa[c] = a.charAt(i);
                    ab[c++] = b.charAt(i);
                }
            }
            if (aa[0] == aa[1] && ab[0] == ab[1]) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

}
