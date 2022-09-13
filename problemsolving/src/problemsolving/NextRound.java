package problemsolving;

import java.util.Scanner;

public class NextRound {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int high = scan.nextInt();
        int[] n = new int[total];
        for (int i = 0; i < total; i++) {
            n[i] = scan.nextInt();
        }
        int max = n[high-1];
        int c = 0;
        for (int i = 0; i < total; i++) {
            if (max <= n[i] && n[i] != 0) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println(c);
        } else {
            System.out.println(0);
        }

    }

}
