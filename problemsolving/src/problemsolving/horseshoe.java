package problemsolving;

import java.util.Scanner;

public class horseshoe {

    public static void main(String aggs[]) {

        Scanner scan = new Scanner(System.in);
        int[] color = new int[4];
        for (int i = 0; i < 4; i++) {
            color[i] = scan.nextInt();

        }
        int count = 0;
        for (int i = 0; i < color.length; i++) {
            for (int j = i; j < color.length; j++) {
                if (i != j) {
                    if (color[i] == color[j]) {
                        count++;
                        break;
                    }
                }
            }

        }
        System.out.println(count);

    }

}
