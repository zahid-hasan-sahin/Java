package Assignment;

import java.util.Scanner;

public class practice_7_2 {

    static String lookupName(String s, String[] name, String[] num) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(s)) {
                return num[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String[] names = {"Michael Myers", "Ash Williams",  "Jack Torrance", "Freddy Krueger"};
        String[] phoneNumbers = {"333-8000", "333-2323","333-6150", "339-7970"};
        System.out.println("Enter name to look up.");
        String targetName = kbd.nextLine();
        String targetPhone = lookupName(targetName, names, phoneNumbers);
        System.out.println("The phone number is " + targetPhone);

    }
}
