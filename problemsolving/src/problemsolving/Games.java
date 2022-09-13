package problemsolving;

import java.util.Scanner;

public class Games {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] h = new int[t];
        int[] g = new int[t];
        for (int i = 0; i < t; i++) {
            h[i] = scan.nextInt();
            g[i] = scan.nextInt();
        }
        int c = 0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (h[i] == g[j]) {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
