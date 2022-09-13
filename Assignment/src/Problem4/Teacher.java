package Problem4;


public class Teacher extends Person {

    private int id;
    private String rank;
    private String mail;
    private String joining_date;
    private int salary;
    private String dept;

    public Teacher(int id, String rank, String mail, String joining_date, int salary, String dept, String name, String gender, int age, int height, int weight, String cell, String city, String birth_place, String birth_date, String address, String nationality) {
        super(name, gender, age, height, weight, cell, city, birth_place, birth_date, address, nationality);
        this.id = id;
        this.rank = rank;
        this.mail = mail;
        this.joining_date = joining_date;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", rank=" + rank + ", mail=" + mail + ", joining_date=" + joining_date + ", salary=" + salary + ", dept=" + dept + " " + "name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight=" + weight + ", cell=" + cell + ", city=" + city + ", birth_place=" + birth_place + ", birth_date=" + birth_date + ", address=" + address + ", nationality=" + nationality + '}';
    }

}
