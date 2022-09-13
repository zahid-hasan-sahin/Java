package Quiz2;

public abstract class Animal {

    private String name;
    private float weight;
    private char gender;

    public Animal(String name, float weight, char gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    abstract public String sound();

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", weight=" + weight + ", gender=" + gender + '}';
    }

}
