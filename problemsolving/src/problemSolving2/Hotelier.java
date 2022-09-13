package problemSolving2;

import java.util.Scanner;

public class Hotelier {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String res = "0".repeat(10);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                res = res.substring(0, res.indexOf("0")) + "1" + res.substring(res.indexOf("0") + 1, res.length());
            } else if (s.charAt(i) == 'R') {
                res = res.substring(0, res.lastIndexOf("0")) + "1" + res.substring(res.lastIndexOf("0") + 1, res.length());
            } else {
                res = res.substring(0,s.charAt(i)-'0') + "0" + res.substring(s.charAt(i)-'0'+1, res.length());
            }
            
        }
        System.out.println(res);

    }

}
