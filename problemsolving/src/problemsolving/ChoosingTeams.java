package problemsolving;

import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if (5 - t >= k) {
                c++;
            }
        }
        System.out.println(c / 3);

    }

}
