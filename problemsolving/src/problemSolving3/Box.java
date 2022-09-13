package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Box {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> arra = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arra.add(scan.nextInt());
            }
            int j = 1;
            boolean b = false;
            ArrayList<Integer> res = new ArrayList<Integer>();
            LinkedList<Integer> temp = new LinkedList<Integer>();
            for (int i = 0; i < n - 1; i++) {
                if (arra.get(i) != j) {
                    temp.add(j);
                    ++j;
                }
            }

            if (b) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(res.get(i) + " ");
                }
            }
            System.out.println();
        }

    }
}
