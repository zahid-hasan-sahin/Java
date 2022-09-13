package problemSolving2;

import java.util.Scanner;

public class BowWowandthTimetable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int one = 0;
        int res = 0;
        if (s.length() == 1 && s.charAt(0) == '0') {
            System.out.println(0);
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ++one;
                }
            }
            for (int i = s.length() - 1; i >= 0; i -= 2) {

                ++res;
            }
            System.out.println(one == 1 && s.length() % 2 == 1 ? res - 1 : res);
        }
    
       

    }

}
