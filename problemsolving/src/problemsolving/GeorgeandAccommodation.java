package problemsolving;

import java.util.Scanner;

public class GeorgeandAccommodation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total_room = scan.nextInt();
        int[] array = new int[total_room * 2];
        for (int i = 0; i < total_room * 2; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < (total_room * 2) - 1; i = i + 2) {
            if (array[i + 1] - array[i] >= 2) {
                count++;
            }

        }
        System.out.println(count);

    }

}
