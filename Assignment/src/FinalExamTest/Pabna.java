package FinalExamTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pabna {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("pabtext.txt"));
        while (scan.hasNext()) {
            String s = scan.next();
            if (s.length() == 8 || s.length() == 10) {
                int c = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '/') {
                        ++c;
                    }
                }
                if (c == s.length()) {
                    System.out.println(s + " ");
                }
            }
        }
    }
}
