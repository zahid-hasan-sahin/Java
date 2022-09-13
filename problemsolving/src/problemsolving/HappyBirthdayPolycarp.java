package problemsolving;

import java.util.Scanner;

public class HappyBirthdayPolycarp {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[9];
        for (int i = 1; i <= 9; i++) {
            num[i - 1] = i;
        }
        int temp = 1;
        while (temp < n) {
            for (int i = 0; i < 9; i++) {
                num[i]  = temp * num[i];
                temp = num[i];
            }
            System.out.println(temp);
        }

    }

}
