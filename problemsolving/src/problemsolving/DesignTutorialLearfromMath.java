package problemsolving;

import java.util.Scanner;

public class DesignTutorialLearfromMath {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            int f = n / 2;
            int s = (n / 2);
            while (true) {

                if (f % 6 == 1 || f % 6 == 5 || s % 6 == 1 || s % 6 == 5) {
                    --f;
                    ++s;
                } else {
                    System.out.println(f + " " + s);
                    break;
                }
            }
        } else {
            int f = n / 2;
            int s = (n / 2) + 1;
            while (true) {

                if (f % 6 == 1 || f % 6 == 5 || s % 6 == 1 || s % 6 == 5) {
                    --f;
                    ++s;
                } else {
                    System.out.println(f + " " + s);
                    break;
                }
            }
        }
    }

}
