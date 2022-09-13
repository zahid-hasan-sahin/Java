package problemsolving;

import java.util.Scanner;

public class I_love_username {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] rate = new int[total];
        for (int i = 0; i < total; i++) {
            rate[i] = scan.nextInt();
        }
        int c = 0;
        int mn = rate[0];
        int mx = rate[0];
        for (int i = 1; i < total; i++) {
            if (mn > rate[i]) {
                mn = rate[i];
                c++;
            }
            if (mx < rate[i]) {
                mx = rate[i];
                c++;
            }

        }
        System.out.println(c);

    }

}
