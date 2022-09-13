package Assignment3;

import java.util.Scanner;

class TimeFormatException extends Exception {

    public TimeFormatException() {
        super("Wrong Time");
    }

    public TimeFormatException(String message) {
        super(message);
    }
}

public class Project_9_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter time in 24-hour notation:");
            String str = scan.next();
            int hh = ((int) str.charAt(0) - '0') * 10 + ((int) str.charAt(1) - '0');
            String day;
            if (hh < 12) {
                day = "AM";
            } else {
                day = "PM";
            }

            hh = hh % 12;
            String mm = "";
            for (int i = 3; i < str.length(); ++i) {
                mm += (str.charAt(i));
            }
            try {
                if (hh >= 24 || Integer.valueOf(mm) >= 60) {
                    throw new TimeFormatException();
                }
                System.out.println("That is the same as");
                if (hh == 0) {
                    System.out.print("12:" + mm);
                } else {
                    System.out.print(hh + ":" + mm);
                }
                System.out.println(" " + day);
                System.out.println("Again? (y/n)");
                String t = scan.next();
                if (!t.equalsIgnoreCase("y")) {
                    break;
                }
            } catch (TimeFormatException e) {
                System.out.println("Error: " + e.toString());
                System.out.println("Try Again:");
            }

        }
    }
}
