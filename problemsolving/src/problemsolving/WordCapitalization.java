package problemsolving;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String r = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
        System.out.println(r);

    }

}
