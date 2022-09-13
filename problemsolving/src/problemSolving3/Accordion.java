package problemSolving3;

import java.util.Scanner;

public class Accordion {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int res = 0;
        int cbpos = -1;
        int clpos = -1;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ']' && cbpos == -1) {
                cbpos = i;
                ++res;
            } else if (s.charAt(i) == ':' && cbpos > -1) {
                clpos = i;
                ++res;
                break;
            }
        }
        boolean ob = true;
        boolean fcl = true;
        for (int i = 0; i < cbpos; i++) {
            if (s.charAt(i) == '[' && ob) {
                ++res;
                ob = false;
            } else if (s.charAt(i) == ':' && !ob && fcl && i != clpos) {
                ++res;
                fcl = false;
            } else if (s.charAt(i) == '|' && !ob && !fcl && i < clpos) {
                ++res;
            }
        }

        System.out.println(res>=4?res:-1);
    }
}
