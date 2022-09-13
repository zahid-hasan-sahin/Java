package problemSolving3;

import java.util.Scanner;

public class DreamoonLikesPermutations {

    public class con {

        int val = 0, fin = 0, lin = 0;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            DreamoonLikesPermutations dm = new DreamoonLikesPermutations();
            DreamoonLikesPermutations.con ob[] = new DreamoonLikesPermutations.con[n];
            for (int i = 0; i < n; i++) {
                ob[i] = dm.new con();
            }
            int mx = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if (ob[in].fin == 0) {

                    ob[in].fin = i;
                } else {
                    ob[in].lin = i;
                }
                ob[in].val++;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(ob[i].fin + " " + ob[i].lin + " " + ob[i].val);
            }
        }

    }

}
