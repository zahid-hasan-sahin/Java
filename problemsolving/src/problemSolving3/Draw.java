package problemSolving3;

import java.util.Scanner;

public class Draw {

    static class goal {

        int f;
        int l;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Draw.goal ob[] = new Draw.goal[n + 1];
        ob[0] = new goal();
        ob[0].l = 0;
        ob[0].f = 0;
        for (int i = 1; i <= n; i++) {
            ob[i] = new goal();
            ob[i].f = scan.nextInt();
            ob[i].l = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Math.min(ob[i + 1].f - ob[i].l, ob[i + 1].l - ob[i].f) > 0 ? Math.min(ob[i + 1].f - ob[i].l, ob[i + 1].l - ob[i].f) : 0;
            while (ob[i].f == ob[i + 1].f && ob[i].l == ob[i + 1].l) {
                ++i;
                if(i>=n){
                    break;
                }
            }if(ob[i].f==ob[i].l){
                ++count;
            }

        }
        System.out.println(count);
    }

}
