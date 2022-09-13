package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AntonandLetters {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<String>();
        s.add(scan.nextLine());
        int i = 0;
        HashSet<String> has = new HashSet<String>();
        while (s.get(0).charAt(i) != '}') {

            if (s.get(0).charAt(i) != '{' && s.get(0).charAt(i) != '}' && s.get(0).charAt(i) != ',' && s.get(0).charAt(i) != ' ') {
                has.add(String.valueOf(s.get(0).charAt(i)));

            }
            i++;

        }

        System.out.println(has.size());
    }
}
