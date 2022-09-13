package problemSolving2;

import java.util.Scanner;

public class AGoodContest {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isGood = false;

        for (int i = 0; i < n; i++) {
            String hadle = scan.next();
            int beforeContest = scan.nextInt();
            int afterContest = scan.nextInt();
            if (beforeContest >= 2400 && afterContest > beforeContest) {
                isGood = true;
            }

        }
        System.out.println(isGood ? "YES" : "NO");

    }
}
