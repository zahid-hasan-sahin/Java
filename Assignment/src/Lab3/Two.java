package Lab3;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] f = new int[101];
        System.out.println("Enter the integers between 1 and 100: ");
        int in = scan.nextInt();
        while (in != 0) {
            ++f[in];
            in = scan.nextInt();
        }
        for (int i = 1; i <= 100; i++) {
            if (f[i] >= 1) {
                System.out.println(i + " occurs " + f[i] + " times");
            }
        }
    }
}
