package problemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class DrazilandFactorial {

   static String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        s = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s += c[i];
        }
        return s;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numberOfDigit = scan.nextInt();
        String s = scan.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4') {
                res += "322";
            } else if (s.charAt(i) == '6') {
                res += "53";
            } else if (s.charAt(i) == '8') {
                res += "7222";
            } else if (s.charAt(i) == '9') {
                res += "7332";
            } else if(s.charAt(i)!='1' && s.charAt(i)!='0') {
                res += s.charAt(i);
            }
        }
        System.out.println(sortString(res));

    }

}
