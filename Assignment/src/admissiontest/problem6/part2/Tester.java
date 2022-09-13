package admissiontest.problem6.part2;

public class Tester {

    static <T extends Animal> T greaterThan(T ob1, T ob2) {
        if (ob1.returnValue() > ob2.returnValue()) {
            return ob1;
        } else {
            return ob2;
        }
    }

    /*
    we implement classes to ensure that they include a given method using interface
     */

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(greaterThan(dog, cat));
    }
}
