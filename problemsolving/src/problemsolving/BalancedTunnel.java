package problemsolving;

import java.util.Scanner;

public class BalancedTunnel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] en = new int[total];
        int[] ex = new int[total];
        for (int i = 0; i < total; i++) {
            en[i] = scan.nextInt();
        }
        for (int i = 0; i < total; i++) {
            ex[i] = scan.nextInt();
        }
        int c = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1; j++) {
                if (en[i] != ex[i]) {
                    c++;
                    en[i + 1] = en[i];

                    break;
                }

            }
        }
        if (en[en.length - 1] != ex[ex.length - 1]) {
            c = c + 1;
        }
        System.out.println(c);
    }

}
