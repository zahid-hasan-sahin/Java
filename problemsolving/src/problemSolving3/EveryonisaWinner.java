package problemSolving3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EveryonisaWinner {

    static int binarySearch(ArrayList<Integer> arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            int y = arr.get(mid);
            if (y == mid) {
                return mid;
            }
            if (y > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int num = scan.nextInt();
            ArrayList<Integer> arra = new ArrayList<Integer>();
            int i = num / 2 + 1;
            int count = 0;
            int c = 0;
            while (i > 0) {
                if (binarySearch(arra, 0, arra.size()-1, num / i) <= 0) {
                    arra.add(num / i);
                    ++count;
                }
                --i;
            }
            System.out.println(count + 1);
            System.out.print(0 + " ");
            for (int j = 0; j < arra.size(); j++) {
                System.out.print(arra.get(j) + " ");

            }
            System.out.println();

        }
    }

}
