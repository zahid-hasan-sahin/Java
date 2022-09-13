package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceTransformation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1 2");
        } else if (n == 3) {
            System.out.println("1 1 3");
        } else {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int c = 0;
            while (Math.pow(2, c) <= n) {
                ar.add((int) Math.pow(2, c));
                ++c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ar.size() - 1; i++) {
                int p = ar.get(i);
                int x = n / ar.get(i);
                int y = n / ar.get(i + 1);

                for (int j = 0; j < x - y; j++) {
                    sb.append(p + " ");
                }
            }
            int k = ar.size();
            if (ar.get(k - 1) + ar.get(k - 2) <= n) {
                sb.append(ar.get(k - 1) + ar.get(k - 2));
            } else {
                sb.append(ar.get(k - 1));
            }
            System.out.println(sb);
        }
    }
}
