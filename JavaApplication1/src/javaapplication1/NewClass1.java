package javaapplication1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How: ");
        int total = scan.nextInt();
        while (total > 0) {
            ArrayList<Integer> val = new ArrayList();
            System.out.print("How Many Element: ");
            int element = scan.nextInt();
            System.out.print("Enter: ");
            for (int i = 0; i < element; i++) {
                val.add(scan.nextInt());
            }
            int temp = val.size();
            if (val.size() == 1 && val.get(0) == 2048) {
                System.out.println("Yes");
            } else {
                for (int i = 0; i < temp; i++) {
                    for (int j = 0; j < temp; j++) {
                        if (i == j) {
                            break;
                        } else {
                            if (val.get(i).equals(val.get(j))) {
                                val.add(val.get(i) + val.get(j));
                                val.remove(val.get(i));
                                temp = val.size();
                                i = 0;
                                j = 0;
                            }
                        }
                    }
                }
                if (val.contains(2048)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            total--;
        }
    }
}
