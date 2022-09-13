package problemsolving;

import java.util.Scanner;

public class RoomsandStaircases {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total > 0) {
            int room = scan.nextInt();
            String s = scan.next();
            char[] val = s.toCharArray();

            int r = 0;
            if (val[0] == '1' || val[val.length - 1] == '1') {
                r = 2;
            } else {
                r = 1;
            }
            for (int i = 0; i < val.length - 1; i++) {
                if (val[i] == '1' && val[i + 1] == '0') {
                    r = r + 2;

                } else if (val[i] == '0') {
                    r++;
                } else {
                    r = r + 2;
                }
            }
            System.out.println(r);
            total--;
        }

    }
}
