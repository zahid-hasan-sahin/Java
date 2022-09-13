package Mid;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = scan.nextInt();
        }
        long last = 0;
        for (int i = 0; i < 9; i++) {
            last += (a[i] * (i + 1));
        }
        System.out.println(last % 11);
    }
}
