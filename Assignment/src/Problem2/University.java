package Problem2;

import java.util.ArrayList;

public class University {

    private ArrayList<Student> student;
    private ArrayList<Teacher> teacher;

    University() {
        student = new ArrayList<Student>();
        teacher = new ArrayList<Teacher>();
    }

    public void addStudent(Student s) {
        student.add(s);
    }

    public void addTeacher(Teacher t) {
        teacher.add(t);
    }

    public void removeStudent(int id) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId() == id) {
                student.remove(i);
                break;
            }
        }
    }

    public void removeTeacher(int id) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getId() == id) {
                teacher.remove(i);
                break;
            }
        }
    }

    public void findInfoOfStudent(int id) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId() == id) {
                System.out.println(student.get(i).toString());
                return;
            }
        }
        System.out.println("Id doesn't exist");
    }

    public void minMaxCgpaUsingBatch(String batch) {

        double mn = Double.MAX_VALUE;
        double mx = -1;
        int indMn = -1;
        int indMx = -1;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getBatch().equals(batch)) {
                if (mn > student.get(i).getCgpa()) {
                    mn = student.get(i).getCgpa();
                    indMn = i;
                }
                if (mx < student.get(i).getCgpa()) {
                    mx = student.get(i).getCgpa();
                    indMx = i;
                }
            }
        }
        if (indMx == -1) {
            System.out.println("NO student found");
        } else {
            System.out.println("Min: " + student.get(indMn).toString());
            System.out.println("Max: " + student.get(indMx).toString());
        }
    }

    public void findInfoOfStudentOfADepartment(String dept) {

        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getDept().equals(dept)) {
                System.out.println(student.get(i).toString());
            }
        }
    }

    public void findInfoOfStudentOfABatchAndCity(String batch, String city) {

        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getBatch().equals(batch) && student.get(i).getCity().equals(city)) {
                System.out.println(student.get(i).toString());
            }
        }
    }

    public void findInfoOfStudentOfANationality(String nationality) {

        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getNationality().equals(nationality)) {
                System.out.println(student.get(i).toString());
            }
        }
    }

    public void findInfoOfSubstringInName(String name) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().contains(name)) {
                System.out.println(student.get(i).toString());
            }
        }
    }

    public void findInfoOfMaleStudent() {
        System.out.println("Male: ");
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getGender().equalsIgnoreCase("male")) {
                System.out.println(student.get(i).getId() + " " + student.get(i).getName() + " " + student.get(i).getBatch() + " " + student.get(i).getAddress());

            }
        }
    }

    public void findInfoOfFemaleStudent() {
        System.out.println("Female: ");
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getGender().equalsIgnoreCase("Female")) {
                System.out.println(student.get(i).getId() + " " + student.get(i).getName() + " " + student.get(i).getBatch() + " " + student.get(i).getAddress());
            }
        }
    }

    public void findInfoOfATeacherUsingRank(String rank) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getRank().equalsIgnoreCase(rank)) {
                System.out.println(teacher.get(i).toString());
            }
        }
    }

    public void minMaxSalarayOfTeacher(String rank) {

        double mn = Double.MAX_VALUE;
        double mx = -1;
        int indMn = -1;
        int indMx = -1;
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getRank().equalsIgnoreCase(rank)) {
                if (mn > teacher.get(i).getSalary()) {
                    mn = teacher.get(i).getSalary();
                    indMn = i;
                }

                if (mx < teacher.get(i).getSalary()) {
                    mx = teacher.get(i).getSalary();
                    indMx = i;
                }
            }
        }
        if (indMx == -1) {
            System.out.println("NO Teacher found");
        } else {
            System.out.println("Min Salary: " + teacher.get(indMn).toString());
            System.out.println("Max Salaray: " + teacher.get(indMx).toString());
        }
    }

    public void findTeacherUsingId(int id) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getId() == id) {
                System.out.println(teacher.get(i).toString());
                break;
            }
        }
    }

    public void findTeacherUsingCell(String cell) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getCell().equals(cell)) {
                System.out.println(teacher.get(i).toString());
                break;
            }
        }
    }

    public void findTeacherUsingMail(String mail) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getCell().equals(mail)) {
                System.out.println(teacher.get(i).toString());
                break;
            }
        }
    }

    public void findTeacherOfACity(String city) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getCity().equalsIgnoreCase(city) || teacher.get(i).getBirth_place().equalsIgnoreCase(city)) {
                System.out.println(teacher.get(i).toString());

            }
        }
    }

}
