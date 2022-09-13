package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlyonaandaNarrowFridge {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        ArrayList<Integer> arra = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            arra.add(in);
            int k = 0;
            Collections.sort(arra, Collections.reverseOrder());
            for (int j = 0; j < arra.size(); j++) {
                if (j % 2 == 0) {
                    k += arra.get(j);
                }
            }
            if (k > h) {
                System.out.println(arra.size() - 1);
                return;
            } else if (i == n - 1) {
                System.out.println(n);
            }

        }

    }

}
