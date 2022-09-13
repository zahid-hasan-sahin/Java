package NumberTheory;

import java.util.Scanner;

public class DigitsSequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 1;
        int[] a = new int[10000000];
        for (int i = 1; i <= 100000; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                a[k++] = s.charAt(j) - '0';
            }
        }
        System.out.println(a[n]);
    }
}
