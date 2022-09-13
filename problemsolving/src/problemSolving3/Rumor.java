package problemSolving3;

import java.util.Scanner;

public class Rumor {

    class overCity {

        int price, index;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Rumor rm = new Rumor();
        Rumor.overCity ob[] = new Rumor.overCity[n + 1];
        ob[0] = rm.new overCity();
        for (int i = 1; i <= n; i++) {
            ob[i] = rm.new overCity();
            ob[i].index = i;
            ob[i].price = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (ob[x].price > ob[y].price) {
                ob[x].index = y;
            } else {
                ob[y].index = x;
            }
        }
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i == ob[i].index) {
                sum += ob[i].price;
            }
        }
        System.out.println(sum);

    }

}
