package Problem4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class University implements AdministratorTaskInterface {

    private ArrayList<Student> student;
    private ArrayList<Teacher> teacher;
    private File teacherFile;
    private File studentFile;

    University() {
        student = new ArrayList<Student>();
        teacher = new ArrayList<Teacher>();
        teacherFile = new File("teacher.csv");
        studentFile = new File("student.csv");
        getTeacherInfoFile();
        getStudentInfoFile();
    }

    public void addStudent(Student s) {
        student.add(s);
        setStudentInfoFile(s);
    }

    public void addTeacher(Teacher t) {
        teacher.add(t);
        setTeacherInfoFile(t);
    }

    public void removeStudent(int id) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId() == id) {
                student.remove(i);
                break;
            }
        }

        updateStudentFile();
    }

    public void removeTeacher(int id) {
        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).getId() == id) {
                teacher.remove(i);
                break;
            }
        }
        updateTeacherFile();
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

    @Override
    public void setStudentInfoFile(Student s) {
        if (!studentFile.exists()) {
            try {
                studentFile.createNewFile();
                System.out.println("File is created");

            } catch (IOException e) {

                e.printStackTrace();
            }
        } else {
            try {
                FileWriter fileWriteObj = new FileWriter(studentFile, true);
                fileWriteObj.append(s.getId() + " " + s.getMail() + " " + s.getCgpa() + " " + s.getBatch() + " " + s.getDept() + " " + s.getName() + " " + s.getGender() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight() + " " + s.getCell() + " " + s.getCity() + " " + s.getBirth_place() + " " + s.getBirth_date() + " " + s.getAddress() + " " + s.getNationality() + "\r\n");
                fileWriteObj.close();
                System.out.println("File is Written");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTeacherInfoFile(Teacher t) {

        if (!teacherFile.exists()) {
            try {
                teacherFile.createNewFile();
                System.out.println("File is created");

            } catch (IOException e) {

                e.printStackTrace();
            }
        } else {
            try {
                FileWriter fileWriteObj = new FileWriter(teacherFile, true);
                fileWriteObj.append(t.getId() + " " + t.getRank() + " " + t.getMail() + " " + t.getJoining_date() + " " + t.getSalary() + " " + t.getDept() + " " + t.getName() + " " + t.getGender() + " " + t.getAge() + " " + t.getHeight() + " " + t.getWeight() + " " + t.getCell() + " " + t.getCity() + " " + t.getBirth_place() + " " + t.getBirth_date() + " " + t.getAddress() + " " + t.getNationality() + "\r\n");
                fileWriteObj.close();
                System.out.println("File is Written");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void getStudentInfoFile() {
        student.clear();
        try {
            Scanner scan = new Scanner(studentFile);
            while (scan.hasNext()) {
                int id = scan.nextInt();
                String mail = scan.next();
                double cgpa = scan.nextDouble();
                String batch = scan.next();
                String dept = scan.next();
                String name = scan.next();
                String gender = scan.next();
                int age = scan.nextInt();
                int height = scan.nextInt();
                int weight = scan.nextInt();
                String cell = scan.next();
                String city = scan.next();
                String birth_place = scan.next();
                String birth_date = scan.next();
                String address = scan.next();
                String nationality = scan.next();
                Student st = new Student(id, mail, cgpa, batch, dept, name, gender, age, height, weight, cell, city, birth_place, birth_date, address, nationality);
                student.add(st);
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void getTeacherInfoFile() {
        teacher.clear();
        try {
            Scanner scan = new Scanner(teacherFile);
            while (scan.hasNext()) {
                int id = scan.nextInt();
                String rank = scan.next();
                String mail = scan.next();
                String joining_date = scan.next();
                int salary = scan.nextInt();
                String dept = scan.next();
                String name = scan.next();
                String gender = scan.next();
                int age = scan.nextInt();
                int height = scan.nextInt();
                int weight = scan.nextInt();
                String cell = scan.next();
                String city = scan.next();
                String birth_place = scan.next();
                String birth_date = scan.next();
                String address = scan.next();
                String nationality = scan.next();
                Teacher tc = new Teacher(id, rank, mail, joining_date, salary, dept, name, gender, age, height, weight, cell, city, birth_place, birth_date, address, nationality);
                teacher.add(tc);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void updateTeacherFile() {

        try {
            FileWriter fileWriteObj = new FileWriter(teacherFile);
            for (int i = 0; i < teacher.size(); i++) {
                Teacher t = teacher.get(i);
                fileWriteObj.write(t.getId() + " " + t.getRank() + " " + t.getMail() + " " + t.getJoining_date() + " " + t.getSalary() + " " + t.getDept() + " " + t.getName() + " " + t.getGender() + " " + t.getAge() + " " + t.getHeight() + " " + t.getWeight() + " " + t.getCell() + " " + t.getCity() + " " + t.getBirth_place() + " " + t.getBirth_date() + " " + t.getAddress() + " " + t.getNationality() + "\r\n");

            }
            fileWriteObj.close();
            System.out.println("File is updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateStudentFile() {

        try {
            FileWriter fileWriteObj = new FileWriter(studentFile);
            for (int i = 0; i < student.size(); i++) {
                Student s = student.get(i);
                fileWriteObj.append(s.getId() + " " + s.getMail() + " " + s.getCgpa() + " " + s.getBatch() + " " + s.getDept() + " " + s.getName() + " " + s.getGender() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight() + " " + s.getCell() + " " + s.getCity() + " " + s.getBirth_place() + " " + s.getBirth_date() + " " + s.getAddress() + " " + s.getNationality() + "\r\n");
            }
            fileWriteObj.close();
            System.out.println("File is updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
