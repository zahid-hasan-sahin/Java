package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twins {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < total; i++) {
            array.add(scan.nextInt());
            sum = sum + array.get(i);
        }
        int max = sum / 2;
        int need = 0;
        int count = 0;
        Collections.sort(array);
        for (int i = array.size() - 1; i >= 0; i--) {
            need = need + array.get(i);
            if (need <= max) {
                count++;
            }

        }
        System.out.println(count + 1);

    }
}
