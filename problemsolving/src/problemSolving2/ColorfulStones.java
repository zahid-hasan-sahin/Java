package problemSolving2;

import java.util.Scanner;

public class ColorfulStones {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                ++j;
            }
        }

        System.out.println(j + 1);

    }

}
