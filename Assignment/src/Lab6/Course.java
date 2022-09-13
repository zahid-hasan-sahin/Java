package Lab6;

import java.util.ArrayList;

public class Course {

    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentList;
    private int numberOfStudents;
    private Faculty faculty;

    public Course() {
        studentList = new ArrayList<Student>();
        numberOfStudents = 0;
    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        numberOfStudents = 0;
        studentList = new ArrayList<Student>();
    }

    public String toString() {
        return "Id: " + courseId
                + "\nTitle: " + courseTitle
                + "\nCredit: " + credit
                + "\nNumberOfStudents: " + numberOfStudents;
    }

    public void addStudent(Student student) {
        studentList.add(student);
        ++numberOfStudents;
    }

    public void dropStudent(int studentId) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.remove(i);
                --numberOfStudents;
                break;
            }
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFacultys() {
        faculty = null;
    }

    public void printStudentList() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentList.get(i).toString());
        }
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

}
