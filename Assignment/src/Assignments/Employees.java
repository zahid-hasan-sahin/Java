package Assignments;

public abstract class Employees implements Company, People {

    abstract public void setId();

    abstract public int getId();

    abstract public void setSalary(double salary);

    abstract public double getSalary();

    @Override
    public String toString() {
        return "Employees{" + '}';
    }

}
