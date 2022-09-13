package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class BrokenKeyboard {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total > 0) {
            String s = scan.next();
            s = s + ' ';
            HashSet<Character> h = new HashSet<Character>();
            int i = 0;
            while (i + 1 < s.length()) {
                int j = i + 1;
                while (s.charAt(i) == s.charAt(j)) {
                    j++;
                }
                if ((j - i + 1) % 2 == 0) {
                    h.add(s.charAt(i));
                }
                i = j;
            }
            ArrayList<Character> na = new ArrayList<Character>(h);
            Collections.sort(na);
            for (int j = 0; j < na.size(); j++) {
                System.out.print(na.get(j));
            }
            System.out.println();
            total--;
            na.clear();
            h.clear();
        }
    }
}
