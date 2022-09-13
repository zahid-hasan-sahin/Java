package ProblemSolving5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OhThosePalindromes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int[] a = new int[26];
        for (int i = 0; i < n; i++) {
            ++a[s.charAt(i) - 'a'];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < a[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }
        System.out.println(sb);

    }

}
