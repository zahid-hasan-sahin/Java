package problemSolving3;

import java.util.Scanner;

public class ExercisingWalk {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int v = Math.abs(a - b) + x;
            int u = Math.abs(c - d) + x;
            int rvd = Math.abs(x + x1);
            int rud = Math.abs(y + y1);
            int rvu = Math.abs(x + x2);
            int ruu = Math.abs(y + y2);
            System.out.println(v);
            System.out.println(u);
            System.out.println(rvd);
            System.out.println(rud);
            System.out.println(rvu);
            System.out.println(ruu);
            if ((v >= rvd && u >= rud) && (v <= rvu && u <= ruu)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }

    }

}
