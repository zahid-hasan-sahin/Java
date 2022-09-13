package problemsolving;

import java.util.Scanner;

public class BrainsPhotos {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int r = 0;
        for (int i = 0; i < m * n; i++) {
            char c = scan.next().charAt(0);
            if (c == 'C' || c == 'M' || c == 'Y') {
                r++;
            }

        }
        if (r > 0) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }

    }

}
