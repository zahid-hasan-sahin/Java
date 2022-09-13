package problemSolving3;

import java.util.Scanner;

public class NewClass7 {

    class p {

        int s, e;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            NewClass7 r = new NewClass7();
            int n = scan.nextInt();
            NewClass7.p ob[] = new NewClass7.p[n + 1];
            ob[0] = r.new p();
            ob[0].s = 0;
            ob[0].e = 0;
            for (int i = 1; i <= n; i++) {
                ob[i] = r.new p();
                ob[i].s = scan.nextInt();
                ob[i].e = scan.nextInt();
            }
            boolean f = false;
            for (int i = 0; i < n; i++) {
                if (ob[i + 1].s - ob[i].s < ob[i + 1].e - ob[i].e || ob[i + 1].s - ob[i].s < 0 || ob[i + 1].e - ob[i].e < 0) {
                    f = true;
                    break;
                }
            }
            if (f) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
