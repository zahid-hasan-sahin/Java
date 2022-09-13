package TestExam;

import java.util.Scanner;

/*
 * Method validate() takes a password string and determines if it is a valid password
 * Valid passwords are at least 8 characters in length and contain at least: one upper case letter,
 * one lower case character, one digit and one of 3 special characters from the set '!' '$' '#' 
 */
public class QB4 {

    /*
	  * Validate a password string. Returns true if the string is at least 8 characters in length and
	  * contains at least: one upper case character, one lower case character, one digit and contains one special 
	  * character from the set of 3 special characters '!' '$' '#' 
	  * returns false otherwise
	  * 
     */
    public static boolean validate(String password) {
        //-----------Start below here. To do: approximate lines of code = 17
        // Fill in the method. Hint: make use of String method charAt(), class Character static methods:
        // isLowerCase(), isUpperCase(), isDigit()
        if (password.length() < 8) {
            return false;
        }
        int up = 0;
        int low = 0;
        int dig = 0;
        boolean sp = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                ++low;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                ++up;
            }
            if (Character.isDigit(password.charAt(i))) {
                ++dig;
            }
            if (password.charAt(i) == '!' || password.charAt(i) == '$' || password.charAt(i) == '#') {
                sp = true;
            }
        }
        return (up >= 1 && low >= 1 && dig >= 1 && sp);
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args) {
        String password = "aBc123xyz!";

        Scanner in = new Scanner(password);
        if (validate(in.next())) {
            System.out.println("ok");
        } else {
            System.out.println("Invalid Password");
        }
        System.out.println("Expected:\nok");

        password = "aBcxyz";
        in = new Scanner(password);
        if (validate(in.next())) {
            System.out.println("ok");
        } else {
            System.out.println("Invalid Password");
        }
        System.out.println("Expected:\nInvalid Password");

        password = "hello$";
        in = new Scanner(password);
        if (validate(in.next())) {
            System.out.println("ok");
        } else {
            System.out.println("Invalid Password");
        }
        System.out.println("Expected:\nInvalid Password");

        password = "Hello123#";
        in = new Scanner(password);
        if (validate(in.next())) {
            System.out.println("ok");
        } else {
            System.out.println("Invalid Password");
        }
        System.out.println("Expected:\nok");

    }
}
