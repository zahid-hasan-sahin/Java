package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Puzzles {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int total = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            array.add(scan.nextInt());
        }
        Collections.sort(array);

        ArrayList<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            r.add(array.get(i + (s - 1)) - array.get(i));
            if (i + (s) == total) {
                break;
            }
        }
        Collections.sort(r);
        System.out.println(r.get(0));

    }

}
