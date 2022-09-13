package problemSolving3;

import java.util.Scanner;

public class KoalaandLights {

    static class tog {

        int a, b;
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        KoalaandLights.tog[] ob = new KoalaandLights.tog[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new tog();
            ob[i].a = scan.nextInt();
            ob[i].b = scan.nextInt();
        }
        int bool[] = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ++bool[i];
                ++res;
            }
        }
        for (int i = 1; i < 100000; i++) {
            for (int j = 0; j < n; j++) {
                if ((i - ob[j].b) % ob[j].a == 0 && i - ob[j].b >= 0) {
                    if (bool[j] == 0) {
                        bool[j] = 1;
                    } else {
                        bool[j] = 0;
                    }
                }

            }

            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (bool[j] == 1) {
                    ++temp;
                }
            }
            res = Math.max(temp, res);
            if (res == n) {
                break;
            }
        }
        System.out.println(res);

    }

}
