package OOp;

public class Person {

    String name;
    int age;

    Person() {
        name = "";
        age = 12;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person ob) {

        //name ,age
        name = ob.name;
        age = ob.age;
    }

    public void details() {
        System.out.println("Name :" + name);
        System.out.println("Age: " + age);
    }

}
