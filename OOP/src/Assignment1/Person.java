package Assignment1;

public class Person {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        name = "No name yes";
    }

    public Person(String initialName) {
        name = initialName;
    }

    public void writeOutput() {
        System.out.println(name);
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }

}
