package solve;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\solve\\input.txt");
        Scanner sc = new Scanner(file);
        ArrayList<Person> a = new ArrayList<Person>();

        int t = sc.nextInt();
            while (t-- > 0) {
            int nid = sc.nextInt();
            double income = sc.nextDouble();
            int age = sc.nextInt();
            String name = sc.next();
            a.add(new Person(nid, income, age, name));
        }
        Collections.sort(a, new myCom());

        try {
            FileWriter fw = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\solve\\out.txt");
            for (int i = 0; i < a.size(); i++) {
                fw.write(String.valueOf(a.get(i).NID + " "));
                fw.write(String.valueOf(a.get(i).income + " "));
                fw.write(String.valueOf(a.get(i).age + " "));
                fw.write(String.valueOf(a.get(i).name + " "));
                fw.write("\r\n");

            }

            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class myCom implements Comparator<Person> {

    @Override
    public int compare(Person ob1, Person ob2) {
        double f = ob1.income;
        double l = ob2.income;
        if (f == l) {
            return ob1.name.length() - ob2.name.length();
        }
        return (int) Math.ceil(l - f);

    }

}

class Person {

    int NID, age;
    double income;
    String name;

    Person(int NID, double income, int age, String name) {
        this.NID = NID;
        this.income = income;
        this.age = age;
        this.name = name;
    }
}
