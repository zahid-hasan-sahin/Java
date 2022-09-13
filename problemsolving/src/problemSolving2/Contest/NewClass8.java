package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass8 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<Integer>();
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    int l = 0;
                    while (s.length() - 1 > i && s.charAt(i + 1) == '0') {
                        ++res;
                        ++i;
                        ++l;
                      
                        if (s.length()-1 == i && s.charAt(i) == '0') {
                            res -= l;
                        }
                    }
                }
            }
            System.out.println(res);

        }

    }

}
