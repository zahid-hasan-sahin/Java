package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '+') {
                int temp = s.charAt(i) - 48;
                array.add(temp);
            }

        }
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            if (i != array.size() - 1) {
                System.out.print(array.get(i) + "+");
            } else {
                System.out.println(array.get(i));
            }

        }

    }
}
