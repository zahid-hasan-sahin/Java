package problemsolving;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VanyaandLanterns {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        ArrayList<Integer> lan = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            lan.add(scan.nextInt());
        }
        Collections.sort(lan);
        int rad = 0;
        for (int i = 0; i < n-1; i++) {
            if (lan.get(i + 1) - lan.get(i) > rad) {
                rad = lan.get(i + 1) - lan.get(i);
            }
        }
        NumberFormat format = new DecimalFormat("0.00");
        System.out.println(format.format(Math.max(lan.get(0), Math.max(rad/2.0, l - lan.get(lan.size() - 1)))));
    }
}
