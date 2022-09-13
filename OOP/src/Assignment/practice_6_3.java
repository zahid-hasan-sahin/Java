package Assignment;

import java.util.Scanner;

class Pet {

    private String name;
    private int age;
    private double weight;

    public Pet() {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    public Pet(String initialName, int initialAge,
            double initialWeigth) {
        name = initialName;
        if ((initialAge < 0) || (initialWeigth < 0)) {
            System.out.println("Error: Negetive age or weight.");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeigth;
        }
    }

    public void setPet(String newName, int newAge,
            double newWeight) {
        name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negetive age or weight.");
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
        name = newName;
    }

    public Pet(int initialAge) {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0) {
            System.out.println("Error: Negative Age");
            System.exit(0);
        } else {
            age = initialAge;
        }
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative Age");
            System.exit(0);
        } else {
            age = newAge;
        }
    }

    public Pet(double initialWeight) {
        name = "No name Yet.";
        age = 0;
        if (initialWeight < 0) {
            System.out.println("Error: Negative Weight");
            System.exit(0);
        } else {
            weight = initialWeight;
        }
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative Weight");
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
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

class Testeter12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First pet name:");
        String name = scan.next();
        System.out.println("Enter First Pet Age");
        int age = scan.nextInt();
        System.out.println("Enter First pet weight");
        double weight = scan.nextDouble();
        Pet one = new Pet(name, age, weight);

        System.out.print("Enter second pet name:");
        name = scan.next();
        System.out.println("Enter second Pet Age");
        age = scan.nextInt();
        System.out.println("Enter second pet weight");
        weight = scan.nextDouble();
        Pet two = new Pet(name);
        two.setAge(age);
        two.setWeight(weight);

        System.out.print("Enter third pet name:");
        name = scan.next();
        System.out.println("Enter third Pet Age");
        age = scan.nextInt();
        System.out.println("Enter third pet weight");
        weight = scan.nextDouble();
        Pet three = new Pet();
        three.setName(name);
        three.setAge(age);
        three.setWeight(weight);

        System.out.print("Enter Fourth pet name:");
        name = scan.next();
        System.out.println("Enter Fourth Pet Age");
        age = scan.nextInt();
        System.out.println("Enter Fourth pet weight");
        weight = scan.nextDouble();
        Pet four = new Pet(age);
        four.setName(name);
        four.setWeight(weight);

        System.out.print("Enter Fifth pet name:");
        name = scan.next();
        System.out.println("Enter Fifth Pet Age");
        age = scan.nextInt();
        System.out.println("Enter Fifth pet weight");
        weight = scan.nextDouble();
        Pet five = new Pet(weight);
        five.setName(name);
        five.setAge(age);

        if (one.getAge() <= two.getAge() && one.getAge() <= three.getAge() && one.getAge() <= four.getAge()
                && one.getAge() <= five.getAge()) {
            System.out.println("youngest pet name: " + one.getName());
        } else if (two.getAge() <= one.getAge() && two.getAge() <= three.getAge() && two.getAge() <= four.getAge()
                && two.getAge() <= five.getAge()) {
            System.out.println("youngest pet name: " + two.getName());
        } else if (three.getAge() <= one.getAge() && three.getAge() <= two.getAge() && three.getAge() <= four.getAge()
                && three.getAge() <= five.getAge()) {
            System.out.println("youngest pet name: " + three.getName());
        } else if (four.getAge() <= one.getAge() && four.getAge() <= two.getAge() && four.getAge() <= three.getAge()
                && four.getAge() <= five.getAge()) {
            System.out.println("youngest pet name: " + four.getName());
        } else {
            System.out.println("youngest pet name: " + five.getName());
        }

        if (one.getAge() >= two.getAge() && one.getAge() >= three.getAge() && one.getAge() >= four.getAge()
                && one.getAge() >= five.getAge()) {
            System.out.println("oldest pet name: " + one.getName());
        } else if (two.getAge() >= one.getAge() && two.getAge() >= three.getAge() && two.getAge() >= four.getAge()
                && two.getAge() >= five.getAge()) {
            System.out.println("oldest pet name: " + two.getName());
        } else if (three.getAge() >= one.getAge() && three.getAge() >= two.getAge() && three.getAge() >= four.getAge()
                && three.getAge() >= five.getAge()) {
            System.out.println("oldest pet name: " + three.getName());
        } else if (four.getAge() >= one.getAge() && four.getAge() >= two.getAge() && four.getAge() >= three.getAge()
                && four.getAge() >= five.getAge()) {
            System.out.println("oldest pet name: " + four.getName());
        } else {
            System.out.println("oldest pet name: " + five.getName());
        }

        if (one.getWeight() <= two.getWeight() && one.getWeight() <= three.getWeight() && one.getWeight() <= four.getWeight()
                && one.getWeight() <= five.getWeight()) {
            System.out.println("smallest pet name: " + one.getName());
        } else if (two.getWeight() <= one.getWeight() && two.getWeight() <= three.getWeight() && two.getWeight() <= four.getWeight()
                && two.getWeight() <= five.getWeight()) {
            System.out.println("smallest pet name: " + two.getName());
        } else if (three.getWeight() <= one.getWeight() && three.getWeight() <= two.getWeight() && three.getWeight() <= four.getWeight()
                && three.getWeight() <= five.getWeight()) {
            System.out.println("smallest pet name: " + three.getName());
        } else if (four.getWeight() <= one.getWeight() && four.getWeight() <= two.getWeight() && four.getWeight() <= three.getWeight()
                && four.getWeight() <= five.getWeight()) {
            System.out.println("smallest pet name: " + four.getName());
        } else {
            System.out.println("smallest pet name: " + five.getName());
        }

        if (one.getWeight() >= two.getWeight() && one.getWeight() >= three.getWeight() && one.getWeight() >= four.getWeight()
                && one.getWeight() >= five.getWeight()) {
            System.out.println("largest pet name: " + one.getName());
        } else if (two.getWeight() >= one.getWeight() && two.getWeight() >= three.getWeight() && two.getWeight() >= four.getWeight()
                && two.getWeight() >= five.getWeight()) {
            System.out.println("largest pet name: " + two.getName());
        } else if (three.getWeight() >= one.getWeight() && three.getWeight() >= two.getWeight() && three.getWeight() >= four.getWeight()
                && three.getWeight() >= five.getWeight()) {
            System.out.println("largest pet name: " + three.getName());
        } else if (four.getAge() >= one.getWeight() && four.getWeight() >= two.getWeight() && four.getWeight() >= three.getWeight()
                && four.getWeight() >= five.getWeight()) {
            System.out.println("largest pet name: " + four.getName());
        } else {
            System.out.println("largest pet name: " + five.getName());
        }
        double avgw = (one.getWeight() + two.getWeight() + three.getWeight() + four.getWeight() + five.getWeight()) / 5.0;
        System.out.println("average weight of the five pets is:" + avgw);

        double avga = (one.getAge() + two.getAge() + three.getAge() + four.getAge() + five.getAge()) / 5.0;
        System.out.println("average age of the five pets is:" + avga);
    }
}
