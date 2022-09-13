package problemsolving;

import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int sumx = 0, sumy = 0, sumz = 0;
        for (int i = 0; i < total; i++) {
            sumx = sumx + scan.nextInt();
            sumy = sumy + scan.nextInt();
            sumz = sumz + scan.nextInt();
        }
        if (sumx == 0 && sumy == 0 && sumz == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
