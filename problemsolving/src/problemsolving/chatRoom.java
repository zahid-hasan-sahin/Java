package problemsolving;

import java.util.Scanner;

public class chatRoom {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] c = {'h', 'e', 'l', 'l', 'o'};

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c[count]) {
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        if (count == 5) {
            System.out.println("YES");
        } else {
            System.out.println(("NO"));
        }

    }
}
