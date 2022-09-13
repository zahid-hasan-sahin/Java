package problemsolving;

import java.util.Scanner;

public class LuckyYear {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 10) {
            System.out.println(1);
        } else {
            String s = String.valueOf(n);
            int f = (int) (s.charAt(0) - '0') + 1;
            String temp = "";
            for (int i = 1; i < s.length(); i++) {
                temp = temp + "0";

            }
            temp = String.valueOf(f) + temp;
            System.out.println(Integer.valueOf(temp)-n);

        }

    }

}
