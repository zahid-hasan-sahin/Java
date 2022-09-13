package Java_stream;

public class people {

    String name;
    int age;

    people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
    public String toString(){
        return name+" "+ age;
    }
}
