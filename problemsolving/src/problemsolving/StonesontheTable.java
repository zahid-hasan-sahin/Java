package problemsolving;

import java.util.Scanner;

public class StonesontheTable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        String s = scan.next();
        int count = 0;
        for (int i = 0; i < total - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }

        }
        System.out.println(count);

    }

}
