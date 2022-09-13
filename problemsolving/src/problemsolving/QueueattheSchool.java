package problemsolving;

import java.util.Scanner;

public class QueueattheSchool {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int time = scan.nextInt();
        String s = scan.next();
        char[] c = s.toCharArray();
        int r = c.length;
        char temp = ' ';
        for (int j = 0; j < time; j++) {
            for (int i = 0; i < student - 1; i++) {
                if (s.length() == 1) {
                    break;
                }

                if (c[i] == 'B' && c[i + 1] == 'G') {

                    temp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = temp;
                    ++i;

                }
            }
        }
        for (char p : c) {
            System.out.print(p);
        }
        System.out.println();

    }

}
