package Assignment3;

class Person {

    private String name;

    public Person() {
        name = "No name yet";
    }

    public Person(String initialName) {
        name = initialName;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}

class Doctor extends Person {

    String specialty;
    double fee;

    public Doctor(String specialty, double fee, String initialName) {
        super(initialName);
        this.specialty = specialty;
        this.fee = fee;
    }

    public Doctor() {
    }

    public Doctor(String initialName) {
        super(initialName);
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getFee() {
        return fee;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public boolean equals(Doctor otherDoctor) {
        return (this.hasSameName(otherDoctor)
                && this.getFee() == otherDoctor.getFee()
                && this.getSpecialty().equalsIgnoreCase(otherDoctor.getSpecialty())
                && this.getName().equalsIgnoreCase(otherDoctor.getName()));
    }
}

class Tester {

    public static void main(String[] args) {
        Doctor ob1 = new Doctor("Pediatrician", 1000, "A");
        ob1.writeOutput();
        Doctor ob2 = new Doctor("Obstetrician", 2000, "B");
        System.out.println(ob2.equals(ob1));

        Doctor ob3 = new Doctor("Pediatrician", 1000, "A");
        System.out.println(ob3.equals(ob1));
    }
}
