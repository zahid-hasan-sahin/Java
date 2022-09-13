package ProblemSolving5;

import java.util.Scanner;

public class LongNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder s = new StringBuilder(scan.next());
        int[] a = new int[10];
        for (int i = 1; i < 10; i++) {
            a[i] = scan.nextInt();
        }
        boolean b = false;

        for (int i = 0; i < s.length(); i++) {
            if (b) {
                if (s.charAt(i) - '0' > a[s.charAt(i) - '0']) {
                    break;
                }
            }

            if (s.charAt(i) - '0' < a[s.charAt(i) - '0']) {
                b = true;

                s.replace(i, i + 1, String.valueOf(a[s.charAt(i) - '0']));
            }

        }
        System.out.println(s);
    }

}
