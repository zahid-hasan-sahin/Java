package Assignments;

public class Manager extends Employees implements Team {

    public int totalManger;
    int id;
    double salary;
    int cid;
    String cName;
    int nid;
    String pName;
    char teamId;
    int numberOfProject;
    boolean scrum;
    int member;

    Manager() {
        id = 0;
    }

    @Override
    public void setId() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getCiD() {
        return cid;
    }

    @Override
    public void setCname(String name) {
        cName = name;
    }

    @Override
    public String getCname() {
        return cName;
    }

    @Override
    public void setNID(int NID) {
    }

    @Override
    public int getNID() {
        return nid;
    }

    @Override
    public void setPname(String name) {
        pName = name;
    }

    @Override
    public String getPname() {
        return pName;
    }

    @Override
    public char TeamId() {
        return teamId;
    }

    @Override
    public int NOTeamMember() {
        return this.member;
    }

    @Override
    public int NoOfProjects() {
        return this.numberOfProject;
    }

    @Override
    public boolean ScrumMaster() {
        return scrum;
    }

    public void ChangeScrumMaster() {
        scrum = !scrum;
    }

    public void addProject() {
        ++this.numberOfProject;
    }

    public void addTeamMember() {
        ++member;
    }

    int totalManger() {
        return this.totalManger;
    }

    @Override
    public String toString() {
        return "Manager{" + "totalManger=" + totalManger + ", id=" + id + ", salary=" + salary + ", cid=" + cid + ", cName=" + cName + ", nid=" + nid + ", pName=" + pName + ", teamId=" + teamId + ", numberOfProject=" + numberOfProject + ", scrum=" + scrum + ", member=" + member + '}';
    }

}
