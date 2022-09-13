package problemSolving8;


import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class cfContest1682 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            TreeSet<Integer> ar = new TreeSet<Integer>();
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                ar.add(in);
                h.put(in, h.getOrDefault(in, 0) + 1);

            }

            int one = 0;
            int two = 0;

            for (int i : ar) {
                if (h.get(i) >= 2) {
                    ++two;
                } else {
                    ++one;
                }
            }
            System.out.println((one + 1) / 2 + two);
        }
    }
}
