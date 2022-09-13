package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class DataCenter {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("4");
        } else {
            ArrayList<Integer> div = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    div.add(i);
                }
            }
            if (div.size() % 2 == 1) {
                System.out.println(div.get(div.size() / 2) * 4);
            } else {
                System.out.println((div.get(div.size() / 2 - 1) * 2) + (div.get(div.size() / 2) * 2));
            }

        }
    }

}
