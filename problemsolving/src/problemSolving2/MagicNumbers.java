package problemSolving2;

import java.util.Scanner;

public class MagicNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        int countFour = 0;
        boolean res = false;
        if (s.charAt(0) == '1') {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '4') {
                    ++countFour;
                } else {
                    countFour = 0;
                }
                if (countFour >= 3 ||(s.charAt(i) != '1' && s.charAt(i) != '4') ){
                    res = true;
                    break;
                }
            }
            if (res) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        } else {
            System.out.println("NO");
        }

    }

}
