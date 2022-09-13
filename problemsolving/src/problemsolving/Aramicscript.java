package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Aramicscript {

    public static String removeDuplicate(String s) {
        boolean[] rootWord = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            rootWord[s.charAt(i)-'a'] = true;
        }
        String cleanRoot = "";
        for (int i = 0; i < 26; i++) {
            if (rootWord[i] == true) {
                cleanRoot = cleanRoot + (char)(i+'a');
            }
        }
        return cleanRoot;
    }

    public static void main(String args[]) {
        HashSet<String> result = new HashSet<String>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String string = scan.next();
            result.add(removeDuplicate(string));

        }
        System.out.println(result.size());
    }
}
