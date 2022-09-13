package problemsolving;

import java.util.Scanner;

public class NewYearandHurry {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int t = 240 - k;
        int p = 0;
        int i = 1;
        while (p <= t) {
            p = p + 5 * i;
            i++;
        }
        System.out.println(i-2<=n?i-2:n);

    }
}
