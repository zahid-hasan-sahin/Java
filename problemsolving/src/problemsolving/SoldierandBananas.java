package problemsolving;

import java.util.Scanner;

public class SoldierandBananas {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int have = scan.nextInt();
        int total = scan.nextInt();
        int need = 0;
        for (int i = 1; i <= total; i++) {
            need = need + (cost * i);

        }
        if (need - have <=0) {
            System.out.println(0);
        } else {
            System.out.println(need - have);
        }

    }
}
