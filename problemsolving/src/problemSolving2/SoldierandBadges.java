package problemSolving2;


import java.util.Scanner;

public class SoldierandBadges {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] badge = new int[30000];
        int t = 0;
        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            ++badge[temp];
            if (i == n - 1) {
                t = temp;
            }
        }
        int res = 0;
        for (int i = 1; i < 30000; i++) {
            if (badge[i] > 1) {
                badge[i + 1] += (badge[i] - 1);
                res += badge[i] - 1;
            }
        }
        System.out.println(res);
    }
}
