package problemsolving;

import java.util.Scanner;

public class Team {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        String[] words = new String[total+1];
        for (int i = 0; i < total+1; i++) {
            words[i] = scan.nextLine();
        }
        int c = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("1 0 1") || words[i].contains("1 1 0") || words[i].contains("0 1 1") || words[i].contains("1 1 1")) {
                c++;
            }

        }
        System.out.println(c);

    }

}
