package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        array.add(scan.next());
        array.add(scan.next());
        char[] c = scan.next().toCharArray();
        array.add(array.get(0) + array.get(1));
        char[] temp = array.get(2).toCharArray();
        Arrays.sort(temp);
        Arrays.sort(c);
        String first = String.valueOf(c);
        String last = String.valueOf(temp);
        if (first.length() == last.length() && first.contains(last)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
