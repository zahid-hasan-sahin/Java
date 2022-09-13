package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksExchangee {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t > 0) {
            int total = scan.nextInt();
            ArrayList<Integer> val = new ArrayList<Integer>();
            for (int i = 0; i < total; i++) {
                val.add(scan.nextInt());
            }
            int i = val.get(0);
            int k = 1;
            int c = 1;
            int temp;
            int p = val.size() - 1;
            while (p >= 0) {

                temp = k;
                if (val.get(i - 1) == k) {
                    if (val.get(k - 1) == k) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(c + 1 + " ");
                    }
                    k++;
                    if (p == 0) {
                        break;
                    }
                    i = val.get(k - 1);
                    c = 1;
                    p--;

                } else {
                    c++;
                    i = val.get(i - 1);
                }
            }
            System.out.println();
            t--;
        }

    }

}
