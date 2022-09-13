package ProblemSolving5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Rockpaperscissors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] s = new String[3];

        for (int i = 0; i < 3; i++) {
            s[i] = scan.next();
        }
        HashMap<String, String> h = new HashMap<String, String>();
        h.put(s[0], "F");
        h.put(s[1], "M");
        h.put(s[2], "S");
        Arrays.sort(s);
        if (s[0].equals(s[1]) && s[1].equals(s[2])) {
            System.out.println("?");
        } else if (!s[0].equals(s[1]) && !s[1].equals(s[2]) && !s[0].equals(s[2])) {
            System.out.println("?");
        } else if (s[0].equals(s[1]) && s[0].equals("paper") && s[2].equals("scissors")) {
            System.out.println(h.get("scissors"));
        } else if (s[1].equals(s[2]) && s[2].equals("rock") && s[0].equals("paper")) {
            System.out.println(h.get("paper"));
        } else if (s[1].equals(s[2]) && s[2].equals("scissors") && s[0].equals("rock")) {
            System.out.println(h.get("rock"));
        }else{
            System.out.println("?");
        }
    }

}
