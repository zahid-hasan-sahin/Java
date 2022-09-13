package javaapplication1;

import java.util.Scanner;
import java.util.*;
public class NewClass6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String x = in.next();
        String z = x.toLowerCase();
        if (z.chars().distinct().count() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}


