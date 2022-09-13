package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Dragons {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        ArrayList<Integer> kir = new ArrayList<Integer>();
        ArrayList<Integer> dra = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            dra.add(scan.nextInt());
            kir.add(scan.nextInt());
        }
        int bigkir = s;
        int c = 0;
        int i = 0;
        int j = 0;
        int k = 0;

        while (true) {
            if (c == n) {
                System.out.println("YES");
                break;
            }
            if (bigkir > dra.get(j)) {

                ++c;
                bigkir = bigkir + kir.get(j);
                kir.remove(j);
                dra.remove(j);
            } else {
                j++;
            }

            if (j == dra.size()) {
                if (c == k) {
                    System.out.println("NO");
                    break;
                }
                k = c;
                j = 0;
            }
        }
    }
}
