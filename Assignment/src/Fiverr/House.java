package Fiverr;

public class House {

    private String material;
    private int age;

    public House(String material, int age) {
        this.material = material;
        this.age = age;
    }

    public String getMaterial() {
        return material;
    }

    public int getAge() {
        return age;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void about() {
        System.out.println("A " + material + " house of " + age + " age");
    }

    public boolean equals(House other) {
        return other.getMaterial().equals(this.getMaterial()) && other.getAge() == this.getAge();
    }

}
