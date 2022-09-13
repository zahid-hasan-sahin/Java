package Test;

import DuePackage.Due;

public class Student {

    public String name;
    public Due due;
    public int age;

    Student(String name, int age, Due due) throws InvalidExamineeException {
        if (age < 14) {
            throw new InvalidExamineeException("Age is less than 14");
        }
        if (due.getTotalDue() > 10000) {
            throw new InvalidExamineeException("Due is more than 10000");
        }
        this.name = name;
        this.due = due;
        this.age = age;
    }

}
