package problemsolving;

import java.util.HashSet;
import java.util.Scanner;
   
public class Pangram {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        char[] c = new char[total];
        HashSet<Character> has = new HashSet<Character>();
        c = scan.next().toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++) {
            has.add(c[i]);

        }
        if (has.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
