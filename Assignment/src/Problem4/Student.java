package Problem4;



public class Student extends Person {

    private int id;
    private String mail;
    private double cgpa;
    private String batch;
    private String dept;

    public Student(int id, String mail, double cgpa, String batch, String dept, String name, String gender, int age, int height, int weight, String cell, String city, String birth_place, String birth_date, String address, String nationality) {
        super(name, gender, age, height, weight, cell, city, birth_place, birth_date, address, nationality);
        this.id = id;
        this.mail = mail;
        this.cgpa = cgpa;
        this.batch = batch;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", mail=" + mail + ", cgpa=" + cgpa + ", batch=" + batch + ", dept=" + dept + " " + "name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight=" + weight + ", cell=" + cell + ", city=" + city + ", birth_place=" + birth_place + ", birth_date=" + birth_date + ", address=" + address + ", nationality=" + nationality + '}';
    }

}
