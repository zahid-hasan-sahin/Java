package Three;

abstract public class Patient {

    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract int bill();

    public String toString() {
        return id + " " + name;
    }

}
