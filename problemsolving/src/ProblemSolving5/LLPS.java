package ProblemSolving5;

import java.util.Scanner;

public class LLPS {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] a = new int[27];
        for (int i = 0; i < s.length(); i++) {
            ++a[s.charAt(i) - 'a'];
        }
        for (int i = 26; i >= 0; i--) {
            if (a[i] != 0) {
                for (int j = 0; j < a[i]; j++) {
                    System.out.print((char) (i + 'a'));
                }
                break;
            }
        }
        System.out.println();
    }

}
