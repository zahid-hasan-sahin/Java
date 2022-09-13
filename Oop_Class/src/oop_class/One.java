package oop_class;

import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            a.add(s[i]);
        }
        System.out.println(a);
        System.out.println("plurals Words");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).endsWith("s") || a.get(i).endsWith("S")) {
                System.out.print(a.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("Without Plurals Words");
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i).endsWith("s") || a.get(i).endsWith("S"))) {
                System.out.print(a.get(i) + " ");
            }
        }
        System.out.println();

    }

}
