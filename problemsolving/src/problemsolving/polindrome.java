
package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class polindrome {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String get_input = scan.next();
        String temp = "";
        int a = 0, b = 0, count = 0;
        ArrayList<String> array = new ArrayList();
        for (int i = 0; i < get_input.length() - 1; i++) {
            temp = get_input.substring(i, i + 2);
            array.add(temp);
            i = i + 1;
        }
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if (array.get(i).charAt(j) == 'a') {
                    a++;
                } else if (array.get(i).charAt(j) == 'b') {
                    b++;
                }
            }
            if (a > 1 || b > 1) {

                array.set(i, "ab");
                count++;
            }
            a = 0;
            b = 0;
        }
        System.out.println(count);
        for (String p : array) {
            System.out.print(p);
        }
        System.out.println();
    }
}
