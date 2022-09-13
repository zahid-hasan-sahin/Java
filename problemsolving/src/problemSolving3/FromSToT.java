package problemSolving3;

import java.util.ArrayList;
import java.util.Scanner;

public class FromSToT {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();
            String c = scan.next();
            if (a.length() > b.length()) {
                System.out.println("NO");
            } else {
                int[] con = new int[26];
                for (int i = 0; i < c.length(); i++) {
                    ++con[c.charAt(i) - 'a'];
                }
                int j = 0;
                ArrayList<Character> arra = new ArrayList<Character>();
                for (int i = 0; i < b.length() && j < a.length(); i++) {
                    if (b.charAt(i) != a.charAt(j)) {
                        arra.add(b.charAt(i));
                    } else {
                        ++j;
                    }
                }
                for (int i = j; i < b.length(); i++) {
                    arra.add(b.charAt(i));
                }
                boolean ch = false;
                System.out.println(arra);
                for (int i = 0; i < arra.size(); i++) {
                    if (con[arra.get(i) - 'a'] > 0) {
                        con[arra.get(i) - 'a']--;
                    } else {
                        ch = true;
                        break;
                    }
                }
                if (ch) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }

            }

        }
    }

}
