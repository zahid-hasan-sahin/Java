package Assignment3;

import java.util.Scanner;

class MessageTooLongException extends Exception {

    public MessageTooLongException() {
        super("Message Too Long!");
    }

    public MessageTooLongException(String message) {
        super(message);
    }
}

class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a String no more than 20 characters: ");
            String s = scan.nextLine();
            try {
                if (s.length() > 20) {
                    throw new MessageTooLongException();
                } else {
                    System.out.println("You entered " + s.length() + " characters, which is an acceptable length");
                }
            } catch (MessageTooLongException E) {
                System.out.println("Error " + E.toString() + " String must be less than 20 characters");
            }
            System.out.print("Do you want to continue ? y/n: ");
            String in = scan.nextLine();
            if (!in.equals("y")) {
                break;
            }
        }
    }
}
