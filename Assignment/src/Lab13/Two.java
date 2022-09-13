package Lab13;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        try {
            System.out.print("Enter a index: ");
            int ind = scan.nextInt();
            System.out.println(array[ind]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}
