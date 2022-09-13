package problemsolving;

import java.util.Scanner;

public class Cards {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int z = 0, e = 0, r = 0, o = -0, n = 0;
        char[] ch = scan.next().toCharArray();
        for (int i = 0; i < total; i++) {
            if (ch[i] == 'z') {
                z++;
            } else if (ch[i] == 'e') {
                e++;
            } else if (ch[i] == 'r') {
                r++;
            } else if (ch[i] == 'o') {
                o++;
            } else {
                n++;
            }
        }
        int one = 0;
        while (o > 0 && n > 0 && e > 0) {
            one++;
            o--;
            n--;
            e--;
        }
        int zero = 0;
        while (z > 0 && e > 0 && r > 0 && o > 0) {
            zero++;
            z--;
            e--;
            r--;
            o--;
        }
        for (int i = 0; i < one; i++) {
            System.out.print("1 ");
        }
        for (int i = 0; i < zero; i++) {
            System.out.print("0 ");
        }
        System.out.println();
    }

}
