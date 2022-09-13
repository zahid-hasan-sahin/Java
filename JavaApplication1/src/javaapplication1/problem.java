package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How Many Value: ");
        int total = scan.nextInt();
        ArrayList<Integer> array = new ArrayList();
        System.out.print("Please Enter The Value: ");

        for (int i = 0; i < total; i++) {
            array.add(scan.nextInt());
        }
        Collections.sort(array);
        float a = array.get(array.size() - 1);
        float b = array.get(array.size() - 2);
        array.remove(array.size() - 1);
        array.remove(array.size() - 2);
        float min = array.get(1) - array.get(0);
        int[] ar = new int[4];
        for (int i = array.size() - 1; i >= 0; i--) {

            for (int j = i - 1; j > 0; j--) {

                if (array.get(i) - array.get(j) <= min) {

                    min = array.get(i) - array.get(j);

                }
            }
        }
        float result = 0;
        if (a - b == min && a - b != 1) {
            result = (float) (((array.get(array.size() - 1)) + array.get(array.size() - 2)) / min);
        } else {
            result = (float) ((a + b) / min);
        }

        System.out.printf("%.6f", result);
        System.out.println();
    }

}
