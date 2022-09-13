package problemSolving3;

import java.util.Scanner;

public class KthBeautifulString {

    public static int bn(int arr[], int l, int r, int x) {
        int mid = l + (r - l) / 2;
        if (r >= l) {

            if (arr[mid] == x) {
                return mid + 1;
            }

            if (arr[mid] > x) {
                return bn(arr, l, mid - 1, x);
            }

            return bn(arr, mid + 1, r, x);
        }
        return mid;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] arra = new int[63248];
        arra[0] = 1;
        for (int i = 1; i < 63248; i++) {
            arra[i] = (arra[i - 1] + i);
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            StringBuffer sb = new StringBuffer();
            int y = bn(arra, 0, 63247, m);
            for (int i = n - 1; i >= 0; i--) {
                if (y == i || (m - arra[y - 1]) == i) {
                    sb.append("b");

                } else {
                    sb.append("a");
                }
            }

            System.out.println(sb);

        }

    }

}
