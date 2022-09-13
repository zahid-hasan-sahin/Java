package Assignment3;

class Person {
    
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

class Employee extends Person {
    
    double annualSalary;
    int hireDate;
    String identification;
    
    public Employee(String n, double a, int h, String i) {
        super(n);
        annualSalary = a;
        hireDate = h;
        identification = i;
    }
    
    public void writeOutput() {
        super.writeOutput();
        System.out.println(annualSalary);
        System.out.println(hireDate);
        System.out.println(identification);
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }
    
    public int getHireDate() {
        return hireDate;
    }
    
    public String getIdentification() {
        return identification;
    }
    
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }
    
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
    
    public boolean equals(Employee otherEmployee) {
        return (this.hasSameName(otherEmployee)
                && this.getAnnualSalary() == otherEmployee.getAnnualSalary()
                && this.hireDate == otherEmployee.getHireDate()
                && this.name.equalsIgnoreCase(otherEmployee.getName()));
    }
    
}

class Tester {
    
    public static void main(String[] args) {
        Employee ob1 = new Employee("A", 100000, 10, "manager");
        ob1.writeOutput();
        Employee ob2 = new Employee("A", 100000, 10, "manager");
        System.out.println(ob2.equals(ob1));
        
        Employee ob3 = new Employee("B", 200000, 15, "Acountant");
        System.out.println(ob3.equals(ob2));
    }
}
