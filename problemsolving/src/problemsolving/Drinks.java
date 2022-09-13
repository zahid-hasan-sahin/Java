package problemsolving;

import java.util.Scanner;

public class Drinks {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        double sum = 0;
        for (int i = 0; i < total; i++) {
            sum = sum + scan.nextInt();

        }
        System.out.println(sum / total);

    }

}
