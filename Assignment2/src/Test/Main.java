package Test;

import DuePackage.Due;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        try {
            Due d1 = new Due(1000000);
            Student a = new Student("Student1", 20, d1);
            System.out.println("Done1");
        } catch (InvalidExamineeException ex) {
            System.out.println(ex.toString());
        }

        try {
            Due d1 = new Due(10);
            Student a = new Student("Student2", 12, d1);
            System.out.println("done2");
        } catch (InvalidExamineeException ex) {
            System.out.println(ex.toString());
        }

        try {
            Due d1 = new Due(10);
            Student a = new Student("Student2", 16, d1);
            System.out.println("done3");
        } catch (InvalidExamineeException ex) {
            System.out.println(ex.toString());
        }
    }
}
