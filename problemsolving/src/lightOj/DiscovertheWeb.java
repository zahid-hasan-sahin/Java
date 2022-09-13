package lightOj;

import java.util.Scanner;
import java.util.Stack;

public class DiscovertheWeb {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;

        while (q-- > 0) {
            Stack<String> b = new Stack<String>();
            Stack<String> f = new Stack<String>();

            String cr = "http://www.lightoj.com/";
            System.out.println("Case " + t++ + ":");
            while (true) {
                String s = scan.next();
                if (s.equals("BACK")) {
                    if (b.isEmpty()) {
                        System.out.println("Ignored");
                    } else {
                        f.add(cr);
                        cr = b.pop();
                        System.out.println(cr);
                    }
                } else if (s.equals("FORWARD")) {
                    if (f.isEmpty()) {
                        System.out.println("Ignored");
                    } else {
                         b.add(cr);
                        cr = f.pop();                      
                        System.out.println(cr);
                    }
                } else if (s.equals("VISIT")) {
                    String in = scan.next();
                    b.add(cr);
                    cr = in;
                    System.out.println(in);
                    f.clear();

                } else {
                    break;
                }
            }
        }
    }

}
