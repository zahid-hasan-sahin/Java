package problemsolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BookReading {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double m = scan.nextInt();

        LinkedList<String> array = new LinkedList<String>();
        for (int i = 0; i < n; i++) {
            if (i % m == 0) {
                array.add(Integer.toString(i));
            }
        }
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            String r = array.get(i).substring(array.get(i).length() - 1);
            j = j + Integer.valueOf(r);
        }
        System.out.println(j);

    }
}
