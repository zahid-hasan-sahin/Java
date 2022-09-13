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

    public boolean equals(Person b) {
        return this.name.equalsIgnoreCase(b.name);
    }
}

class Vehicle {

    String vname;
    int cylinders;
    Person owner;

    public Vehicle(String vname, int cylinders, Person owner) {
        this.vname = vname;
        this.cylinders = cylinders;
        this.owner = owner;
    }

}

class Truck extends Vehicle {

    double load;
    double towing;

    public Truck(double load, double towing, String vname, int cylinders, Person owner) {
        super(vname, cylinders, owner);
        this.load = load;
        this.towing = towing;
    }

    public double getLoad() {
        return load;
    }

    public double getTowing() {
        return towing;
    }

    public String getvName() {
        return vname;
    }

    public int getCylinders() {
        return cylinders;
    }

    public Person getOwner() {
        return owner;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public void setTowing(double towing) {
        this.towing = towing;
    }

    public void setvName(String name) {
        this.vname = name;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void writeOutput() {
        System.out.println("Name: " + this.vname);
        System.out.println("Owner: " + this.owner.getName());
        System.out.println("cylinders: " + cylinders);
        System.out.println("towing: " + towing);
        System.out.println("load: " + load);
    }

    public boolean equals(Truck otherTruck) {
        return (this.getOwner().equals(otherTruck.getOwner())
                && this.getCylinders() == otherTruck.getCylinders()
                && this.getvName().equalsIgnoreCase(otherTruck.getvName())
                && this.getLoad() == otherTruck.getLoad()
                && this.getTowing() == otherTruck.getTowing());
    }

}

class Tester {

    public static void main(String[] args) {
        Truck ob1 = new Truck(100, 100, "A", 50, new Person("P1"));
        ob1.writeOutput();
        Truck ob2 = new Truck(100, 100, "A", 50, new Person("P1"));
        System.out.println(ob2.equals(ob1));

        Truck ob3 = new Truck(150, 200, "B", 20, new Person("P2"));;
        System.out.println(ob3.equals(ob1));
    }
}
