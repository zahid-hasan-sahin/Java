package Problem4;


import java.util.Scanner;

public class Tester {

    static void CommandList() {
        System.out.println("1.add a student\n"
                + "2.add a teacher\n"
                + "3.remove a student\n"
                + "4.remove a teacher\n"
                + "5.find information of a student\n"
                + "6.find information who got max/min cgpa using batch\n"
                + "7.find information of all student of particular depertment\n"
                + "8.find information of all student of particular batch and city\n"
                + "9.find information of all student of particular nationality\n"
                + "10.find information of all student of particular who has certain substring in their name\n"
                + "11.find id,name,batch and address of male students\n"
                + "12.find id,name,batch and address of female students\n"
                + "13.find a teacher who belong to a particular rank\n"
                + "14.find a particular teacher's whose salary is maximum/minimum and belong a particular rank\n"
                + "15.find information of teacher using id\n"
                + "16.find information of teacher using cell no\n"
                + "17.find information of teacher using mail\n"
                + "18.find infomation of teacher who live in a particular city or born in that city\n"
                + "19.Exit\n");
        System.out.print("Enter a Command: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        University un = new University();
        while (true) {
            CommandList();
            int in = scan.nextInt();
            if (in == 1) {
                System.out.print("Enter Id: ");
                int id = scan.nextInt();
                System.out.print("Enter Mail: ");
                String mail = scan.next();
                System.out.print("Enter CGPA: ");
                double cgpa = scan.nextDouble();
                System.out.print("Enter Batch: ");
                String batch = scan.next();
                System.out.print("Enter Department: ");
                String dept = scan.next();
                System.out.print("Enter Name: ");
                String name = scan.next();
                System.out.print("Enter Gender: ");
                String gender = scan.next();
                System.out.print("Enter Age: ");
                int age = scan.nextInt();
                System.out.print("Enter height: ");
                int height = scan.nextInt();
                System.out.print("Enter weight: ");
                int weight = scan.nextInt();
                System.out.print("Enter Cell: ");
                String cell = scan.next();
                System.out.print("Enter City:");
                String city = scan.next();
                System.out.print("Enter Birth place: ");
                String birth_place = scan.next();
                System.out.print("Enter birth date: ");
                String birth_date = scan.next();
                System.out.print("Enter Address : ");
                String address = scan.next();
                System.out.print("Enter nationality: ");
                String nationality = scan.next();
                Student student = new Student(id, mail, cgpa, batch, dept, name, gender, age, height, weight, cell, city, birth_place, birth_date, address, nationality);
                un.addStudent(student);

                System.out.println("---------------------------------------");
            } else if (in == 2) {
                System.out.print("Enter Id: ");
                int id = scan.nextInt();
                System.out.print("Enter Rank: ");
                String rank = scan.next();
                System.out.print("Enter Mail: ");
                String mail = scan.next();
                System.out.print("Enter Joining Date: ");
                String joining_date = scan.next();
                System.out.print("Enter Salary: ");
                int salary = scan.nextInt();
                System.out.print("Enter Department: ");
                String dept = scan.next();
                System.out.print("Enter Name: ");
                String name = scan.next();
                System.out.print("Enter Gender: ");
                String gender = scan.next();
                System.out.print("Enter Age: ");
                int age = scan.nextInt();
                System.out.print("Enter height: ");
                int height = scan.nextInt();
                System.out.print("Enter weight: ");
                int weight = scan.nextInt();
                System.out.print("Enter Cell: ");
                String cell = scan.next();
                System.out.print("Enter City:");
                String city = scan.next();
                System.out.print("Enter Birth place: ");
                String birth_place = scan.next();
                System.out.print("Enter birth date: ");
                String birth_date = scan.next();
                System.out.print("Enter Address : ");
                String address = scan.next();
                System.out.print("Enter nationality: ");
                String nationality = scan.next();
                Teacher teacher = new Teacher(id, rank, mail, joining_date, salary, dept, name, gender, age, height, weight, cell, city, birth_place, birth_date, address, nationality);
                un.addTeacher(teacher);
                System.out.println("---------------------------------------");
            } else if (in == 3) {
                System.out.print("Enter student Id: ");
                int id = scan.nextInt();
                un.removeStudent(id);
                System.out.println("---------------------------------------");
            } else if (in == 4) {
                System.out.print("Enter Teacher Id: ");
                int id = scan.nextInt();
                un.removeTeacher(id);
                System.out.println("---------------------------------------");
            } else if (in == 5) {
                System.out.print("Enter student Id: ");
                int id = scan.nextInt();
                un.findInfoOfStudent(id);
                System.out.println("---------------------------------------");
            } else if (in == 6) {
                System.out.print("Enter student Batch: ");
                String batch = scan.next();
                un.minMaxCgpaUsingBatch(batch);
                System.out.println("---------------------------------------");
            } else if (in == 7) {
                System.out.print("Enter student Depertment: ");
                String dept = scan.next();
                un.findInfoOfStudentOfADepartment(dept);
                System.out.println("---------------------------------------");
            } else if (in == 8) {
                System.out.print("Enter student Depertment: ");
                String dept = scan.next();
                System.out.print("Enter student City: ");
                String city = scan.next();
                un.findInfoOfStudentOfABatchAndCity(dept, city);
                System.out.println("---------------------------------------");
            } else if (in == 9) {
                System.out.print("Enter student nationality: ");
                String nationality = scan.next();
                un.findInfoOfStudentOfANationality(nationality);
                System.out.println("---------------------------------------");
            } else if (in == 10) {
                System.out.print("Enter Substring: ");
                String substring = scan.next();
                un.findInfoOfSubstringInName(substring);
                System.out.println("---------------------------------------");
            } else if (in == 11) {
                un.findInfoOfMaleStudent();
                System.out.println("---------------------------------------");
            } else if (in == 12) {
                un.findInfoOfFemaleStudent();
                System.out.println("---------------------------------------");
            } else if (in == 13) {
                System.out.print("Enter rank: ");
                String rank = scan.next();
                un.findInfoOfATeacherUsingRank(rank);
                System.out.println("---------------------------------------");

            } else if (in == 14) {
                System.out.print("Enter rank: ");
                String rank = scan.next();
                un.minMaxSalarayOfTeacher(rank);
                System.out.println("---------------------------------------");
            } else if (in == 15) {
                System.out.print("Enter Id: ");
                int rank = scan.nextInt();
                un.findTeacherUsingId(rank);
                System.out.println("---------------------------------------");
            } else if (in == 16) {
                System.out.print("Enter Cell No: ");
                String cell = scan.next();
                un.findTeacherUsingCell(cell);
                System.out.println("---------------------------------------");
            } else if (in == 17) {
                System.out.print("Enter Mail: ");
                String mail = scan.next();
                un.findTeacherUsingMail(mail);
                System.out.println("---------------------------------------");
            } else if (in == 18) {
                System.out.print("Enter City: ");
                String city = scan.next();
                un.findTeacherOfACity(city);
                System.out.println("---------------------------------------");
            } else {
                break;
            }
        }

    }
}
