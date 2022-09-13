package problemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class YetAnotherWalkingRobot {

    public static String sortString(String inputString) {
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray();

        // sort tempArray 
        Arrays.sort(tempArray);

        // return new sorted string 
        return new String(tempArray);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int te = scan.nextInt();
        while (te-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int x = 0;
            int y = 0;
            boolean ch = false;
            boolean c = false;
            boolean ans = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) == 'U' && s.charAt(i + 1) == 'D') || (s.charAt(i) == 'D' && s.charAt(i + 1) == 'U') || (s.charAt(i) == 'L' && s.charAt(i + 1) == 'R') || (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L')) {
                    x = i + 1;
                    y = i + 2;
                    ch = true;
                    ans = true;
                }
            }
            if (ch) {
                System.out.println(x + " " + y);
            }
            if (!ch) {
                String temp = "";

                for (int i = 0; i < s.length() - 3; i++) {
                    int j = i;
                    int q = 0;
                    String tem =" ";
                    while (s.charAt(j) == s.charAt(j+1)) {
                        q++;                      
                    }
                    String tm = s.substring(i, i + 4);
                    String t = sortString(tm);
                    if (t.charAt(0) == 'D' && t.charAt(1) == 'L' && t.charAt(2) == 'R' && t.charAt(3) == 'U') {
                        x = i + 1;
                        y = i + 4;
                        ch = true;
                        ans = true;
                    }

                }
                if (ch) {
                    System.out.println(x + " " + y);
                }
            }
            if (!ans) {
                System.out.println("-1");
            }

        }

    }
}
