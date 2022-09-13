package Library;

import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter product Id: ");
            String s = scan.next();
            BookDB ob = new BookDB();
            Book b = ob.getBook(s);
            System.out.println("Name: " + b.getName());
            System.out.println("Discription: " + b.getDescription());
            System.out.println("Price: " + b.getPrice());
            
            System.out.print("Do you want to Continue ?(y/n)");
            String k = scan.next();
            
            if (k.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
