package problemsolving;

import java.util.Scanner;

public class StringTask {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y') {
                System.out.print("." + s.charAt(i));
                
            }

        }
        System.out.println();
    }
}
