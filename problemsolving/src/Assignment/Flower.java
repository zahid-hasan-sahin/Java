package Assignment;

interface Animal {

    public void work();
}

interface Person {

    public void eat();
}

class Teacher implements Animal, Person {

    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

}

class Tester {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.work();
        teacher.eat();

    }
}
