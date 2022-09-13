package oop_class;

import java.util.Scanner;

/* Name :Adil
  Id : 110
  section :c
  email: adil@gmail.com
  date : 16/11/2021
 */
public class Main {

    public static void main(String[] args) {
        String section;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Section");

        section = sc.nextLine();// section = c

        Info info = new Info();
        Hobby hobby = new Hobby();

        info.id = 110;
        info.name = "Adil";
        hobby.hobbyName = "Reading";

        System.out.println("----------Details-----------");
        System.out.println("Id : " + info.id);
        System.out.println("Name : " + info.name);
        System.out.println("Hobby : " + hobby.hobbyName);
        System.out.println("Section : " + section);
    }
}
