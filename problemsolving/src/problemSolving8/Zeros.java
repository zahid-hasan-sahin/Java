package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class Zeros {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        ArrayList<Long> five = new ArrayList<Long>();
        ArrayList<Long> two = new ArrayList<Long>();
        int p = 0;
        while (true) {
            long w = 1;
            for (int i = 0; i < p; i++) {
                w *= 2;
            }
            if (w > b) {
                break;
            }
            two.add(w);
            ++p;
        }
        p = 0;
        while (true) {
            long w = 1;
            for (int i = 0; i < p; i++) {
                w *= 5;
            }
            if (w > b) {
                break;
            }
            five.add(w);
            ++p;
        }
        int t = 0, f = 0;
        for (int i = 0; i < two.size(); i++) {
            long k = two.get(i);
            long r = (a / k) * k;

            if (r == a) {
                t = i;
            }
            if (r + k <= b) {
                t = i;
            }
        }

        for (int i = 0; i < five.size(); i++) {
            long k = five.get(i);
            long r = (a / k) * k;
            if (r == a) {
                f = i;
            }
            if (r + k <= b) {
                f = i;
            }
        }
        System.out.println(Math.min(f, t));
    }

}
