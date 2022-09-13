package Assignment;

class Person {

    private String name;
    private int age;

    Person() {
        name = "";
        age = 0;
    }

    Person(String name) {
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("ERROR: Age is "
                    + "negative.");
            System.exit(0);
        }
    }

    public void setPerson(String newName, int newAge) {
        setName(newName);
        setAge(newAge);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    boolean isEqualObject(Person p) {
        if (p.name.equalsIgnoreCase(name) && p.age == age) {
            return true;
        }
        return false;
    }

    boolean isEqualName(Person p) {
        return p.name.equalsIgnoreCase(name);
    }

    boolean isEqualAge(Person p) {
        return p.age == age;
    }

    boolean isOlder(Person p) {
        return p.age > age;
    }

    boolean isYounger(Person p) {
        return p.age < age;
    }
}

class Tester8 {

    public static void main(String[] args) {
        Person ob1 = new Person();
        ob1.setName("A");
        ob1.setAge(20);
        Person ob2 = new Person("B");
        ob2.setAge(20);
        System.out.println(ob1.isEqualAge(ob2));
        System.out.println(ob1.isEqualName(ob2));
        System.out.println(ob1.isEqualObject(ob2));
        System.out.println(ob1.isOlder(ob2));
        System.out.println(ob1.isYounger(ob2));

        Person ob3 = new Person(20);
        ob3.setName("A");

        Person ob4 = new Person("A", 20);

        System.out.println(ob3.isEqualAge(ob4));
        System.out.println(ob3.isEqualName(ob4));
        System.out.println(ob3.isEqualObject(ob4));
        System.out.println(ob3.isOlder(ob4));
        System.out.println(ob3.isYounger(ob4));
    }
}
