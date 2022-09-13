package problemsolving;

import java.util.Scanner;

public class Watermelon {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int c = 0;
        for (int i = 2; i < input; i = i + 2) {
            for (int j = 2; j < input; j = j + 2) {
                if (i + j == input) {
                    c++;
                    break;
                }

            }
        }
        if (c == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}
