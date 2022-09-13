package lightOj;

import java.util.Scanner;

public class HiddenSecret {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        scan.nextLine();
        while (q-- > 0) {
            String s1 = scan.nextLine().toLowerCase();
            String s2 = scan.nextLine().toLowerCase();
            int[] a = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != ' ') {

                    ++a[s1.charAt(i) - 'a'];
                }

            }

            int[] r = new int[26];
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) != ' ') {
                    ++r[s2.charAt(i) - 'a'];
                }
            }
            boolean c = false;
            for (int i = 0; i < 26; i++) {

                if (r[i] != a[i]) {
                    c = true;
                    break;
                }
            }
            System.out.print("Case " + t++ + ": ");
            if (c) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

        }
    }

}
