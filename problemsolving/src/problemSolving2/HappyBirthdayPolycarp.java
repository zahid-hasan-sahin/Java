package problemSolving2;

import java.util.Scanner;

public class HappyBirthdayPolycarp {

    static int makeRepeadtNum(int n) {
        String tempString = String.valueOf(n);
        String r = "";
        for (int i = 0; i < tempString.length(); i++) {
            r = r + 1;

        }
        if (tempString.contains("9")) {
            if (n < 10) {
                return 2;
            }
            int temp = Integer.parseInt((Integer.parseInt(r) / 10) + "" + 2);
            return temp;

        }
        return Integer.parseInt(r);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int num = scan.nextInt();
            int increasing = 0;
            int res = 0;
            while (num >= increasing) {
                ++res;
                increasing += makeRepeadtNum(increasing);

            }
            System.out.println(res - 1);

        }

    }

}
