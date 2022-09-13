package problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SinglePush {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }

            a.set(0, scan.nextInt() - a.get(0));
            int max = a.get(0);
            if (max < 0) {
                System.out.println("NO");
            } else {
                for (int i = 1; i < a.size(); i++) {
                    a.set(i, scan.nextInt() - a.get(i));
                    max = Math.max(a.get(i), max);
                }
                int c = 0;
                HashSet<Integer> val = new HashSet<Integer>();
                System.out.println(a);
                for (int i = 0; i < a.size(); i++) {
                    if (a.get(i) != 0) {
                        int temp = a.get(i);
                        while (a.get(i) == temp) {
                            val.add(a.get(i));
                        }

                    }
                }
                if (val.size() == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }
}
