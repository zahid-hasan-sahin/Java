package problemSolving2;

import java.util.Scanner;

public class Mikeandpalindrome {

    static String makebackward(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String b = makebackward(s);
        if (s.equals(b)) {
            if(s.length()%2==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        } else {
            int temp = 0;
            String ts = "", tb = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != b.charAt(i)) {
                    ts += s.charAt(i);
                    tb += b.charAt(i);
                    ++temp;
                }
            }
            ts = makebackward(tb);

            if (temp == 2 && ts.equals(ts)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
