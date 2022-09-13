package javaapplication1;
import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] array = s.split(" ");
        int c = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i].length() % 2 == 1 && (array[i].charAt(array[i].length() / 2) == 'A' || array[i].charAt(array[i].length() / 2) == 'a')) {
                c++;
            }
        }
        System.out.println(c);

    }

}
