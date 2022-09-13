package problemSolving3;

import java.util.Scanner;

public class Keyboard {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String c = scan.next();
        String in = scan.next();
        String res = "";
        for (int i = 0; i < in.length(); i++) {
            if (c.equals("R")) {
                res+= s.charAt(s.indexOf(in.charAt(i))-1);
            } else {
               res+= s.charAt(s.indexOf(in.charAt(i))+1);
            }

        }
        System.out.println(res);

    }

}
