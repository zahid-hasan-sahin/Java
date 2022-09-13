package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LessorEqual {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numbers.add(scan.nextInt());
        }
        Collections.sort(numbers);
        if (k == 0) {
            if (numbers.get(0) != 1) {
                System.out.println(1);
            } else {
                System.out.println("-1");
            }
        } else {
            int temp = numbers.get(k - 1);
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (numbers.get(i) <= temp) {
                    ++res;
                }
            }
            if (res == k) {
                System.out.println(numbers.get(k - 1));
            } else {
                System.out.println("-1");
            }
        }

    }

}
