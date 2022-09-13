package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long total = scan.nextInt();
        ArrayList<Long> array = new ArrayList<Long>();
        for (int i = 0; i < total; i++) {
            array.add(scan.nextLong());
        }
        Collections.sort(array);
        long min = array.get(1) - array.get(0);
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1) - array.get(i) < min) {
                min = array.get(i + 1) - array.get(i);
            }
        }
        System.out.println(min);

    }

}
