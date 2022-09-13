package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pet {

    private String name;
    private int age;
    private double weight;

    public Pet() {
        name = "No name Yet.";
        age = 0;
        weight = 0;
    }

    public Pet(String initialName, int initialAge,
            double initialWeight) {
        name = initialName;
        if (initialAge < 0 || initialWeight < 0) {
            System.out.println("Error: negetive age or weighti");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void setPet(String newName, int newAge,
            double newWeight) {
        name = newName;
        if (newAge < 0 || newWeight < 0) {
            System.out.println("Error: negetive age or weighti");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
    }

    public Pet(String initialName) {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Pet(int initialAge) {
        name = "NO name Yet";
        weight = 0;
        if (initialAge < 0) {
            System.out.println("Erro : negetive age");
            System.exit(0);
        } else {
            age = initialAge;
        }
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Erro : negetive age");
            System.exit(0);
        } else {
            age = newAge;
        }
    }

    public Pet(double initialWeight) {
        name = "NO name Yet";
        weight = 0;
        if (initialWeight < 0) {
            System.out.println("Erro : negetive age");
            System.exit(0);
        } else {
            weight = initialWeight;
        }
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Erro : negetive age");
            System.exit(0);
        } else {
            weight = newWeight;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " Years");
        System.out.println("Weight: " + weight + " pounds");
    }

}

class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of Pet: ");
        int n = scan.nextInt();
        ArrayList<Pet> ar = new ArrayList<Pet>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            String name = scan.next();
            System.out.print("Enter age: ");
            int age = scan.nextInt();
            System.out.print("Enter Weight: ");
            double weight = scan.nextDouble();
            Pet ob = new Pet(name, age, weight);
            ar.add(ob);
        }
        Collections.sort(ar, new Sorter());
        for (int i = 0; i < n; i++) {
            ar.get(i).writeOutput();
        }
    }
}

class Sorter implements Comparator<Pet> {

    @Override
    public int compare(Pet a, Pet b) {
        return a.getName().compareTo(b.getName());
    }

}
