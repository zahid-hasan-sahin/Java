package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewClass13 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            for (int i = 0; i < n; i++) {
                b.add(scan.nextInt());
            }
            
            Collections.sort(a);
            Collections.sort(b);
            for (int i = 0; i < n; i++) {
                System.out.print(a.get(i)+" ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(b.get(i)+" ");
            }
            System.out.println();

        }

    }
}
