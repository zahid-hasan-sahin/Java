package test;

public abstract class Person {

    abstract int getage();
    String name, address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + " ]";
    }
}

class Student extends Person {

    String program;
    int year;
    double fee;

    @Override

    int getage() {
        return year;
    }

    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    String getProgram() {
        return program;
    }

    void setProgram(String program) {
        this.program = program;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    double getFee() {
        return fee;
    }

    void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + ",Prgaram=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}

class Staff extends Person {

    String school;
    double pay;
    int age;

    @Override

    int getage() {
        return age;
    }

    Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    String getSchool() {
        return school;
    }

    void setSchool(String school) {
        this.school = school;

    }

    double getPay() {
        return pay;
    }

    void setPay(double pay) {

        this.pay = pay;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + ",School=" + school + ",Pay=" + pay + "]";
    }
}
