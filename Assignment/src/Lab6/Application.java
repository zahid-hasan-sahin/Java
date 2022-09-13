package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    static void commandList() {

        System.out.println(
                "1.Add\n"
                + "2. Delete\n"
                + "3. Update\n"
                + "4. Print\n"
                + "5. Search\n"
                + "6. Assign a student to a course\n"
                + "7. Assign a Faculty to a course\n"
                + "8. Quit\n");
        System.out.print("Enter a Command: ");

    }

    static void commandListForAdd() {

        System.out.println(
                "1. Add a Student\n"
                + "2. Add a Course\n"
                + "3. Add a Faculty\n");
        System.out.print("Enter a Command: ");

    }

    static void commandListForDelete() {

        System.out.println(
                "1. Delete a Student\n"
                + "2. Delete a Course\n"
                + "3. Delete a Faculty\n");
        System.out.print("Enter a Command: ");

    }

    static void commandListForUpdate() {

        System.out.println(
                "1. Update a Student\n"
                + "2. Update a Course\n"
                + "3. Update a Faculty\n");
        System.out.print("Enter a Command: ");

    }

    static void commandListForPrint() {

        System.out.println(
                "1. Print all students\n"
                + "2. Print all course\n"
                + "3. Print all faculties\n"
                + "4. Print information of a student\n"
                + "5. Print information of a course\n"
                + "6. Print information of a faculty\n"
                + "7. Print student list and faculty information of a course\n"
                + "8. Print courses taken by a student\n");
        System.out.print("Enter a Command: ");

    }

    static void commandListForSearch() {

        System.out.println(
                "1. Search a Student\n"
                + "2. Search a Course\n"
                + "3. Search a Faculty\n"
                + "4. Search whether a student takes a course\n"
                + "5. Search whether a faculty teaches a course\n"
                + "6. Search courses taken by a student\n"
                + "7. Search courses taught by a faculty\n");
        System.out.print("Enter a Command: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();
        ArrayList<Faculty> faculty = new ArrayList<Faculty>();
        ArrayList<Course> course = new ArrayList<Course>();

        while (true) {
            commandList();
            int in = scan.nextInt();
            if (in == 1) {
                commandListForAdd();
                int com = scan.nextInt();
                if (com == 1) {
                    System.out.print("Student Id: ");
                    int id = scan.nextInt();
                    System.out.print("Student Name: ");
                    String name = scan.next();
                    System.out.print("Student CGPA: ");
                    double cgpa = scan.nextDouble();
                    student.add(new Student(id, name, cgpa));
                } else if (com == 2) {
                    System.out.print("Enter Course Id: ");
                    String id = scan.next();
                    System.out.print("Enter Course title: ");
                    String title = scan.next();
                    System.out.print("Enter Course credit: ");
                    double credit = scan.nextDouble();
                    course.add(new Course(id, title, credit));
                } else if (com == 3) {
                    System.out.print("Enter Faculty Id: ");
                    int id = scan.nextInt();
                    System.out.print("Enter Faculty name: ");
                    String name = scan.next();
                    System.out.print("Enter Faculty Postion: ");
                    String position = scan.next();
                    faculty.add(new Faculty(id, name, position));
                }
                System.out.println("\n\n");
            } else if (in == 2) {
                commandListForDelete();
                int com = scan.nextInt();
                if (com == 1) {
                    System.out.print("Student Id that you want to delete: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < student.size(); i++) {
                        if (student.get(i).getStudentId() == id) {
                            student.remove(i);
                            break;
                        }
                    }
                } else if (com == 2) {
                    System.out.print("Course Id that you want to delete: ");
                    String id = scan.next();
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseId().equals(id)) {
                            course.remove(i);
                            break;
                        }
                    }
                } else if (com == 3) {
                    System.out.print("Faculty Id that you want to delete: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < faculty.size(); i++) {
                        if (faculty.get(i).getFacultyId() == id) {
                            faculty.remove(i);
                            break;
                        }
                    }
                }
                System.out.println("\n\n");
            } else if (in == 3) {
                commandListForUpdate();
                int com = scan.nextInt();
                if (com == 1) {
                    System.out.print("Student Id that you want to Update: ");
                    int id = scan.nextInt();
                    boolean isFound = false;
                    for (int i = 0; i < student.size(); i++) {
                        if (student.get(i).getStudentId() == id) {
                            System.out.print("Student name(update): ");
                            String name = scan.next();
                            System.out.print("Student cgpa(update): ");
                            double cgpa = scan.nextDouble();
                            student.get(i).setStudentName(name);
                            student.get(i).setStudentCGPA(cgpa);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Id not found");
                    }
                } else if (com == 2) {
                    System.out.print("Course Id that you want to Update: ");
                    String id = scan.next();
                    boolean isFound = false;
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseId().equals(id)) {
                            System.out.print("Course Title(update): ");
                            String title = scan.next();
                            System.out.print("Course credit(update): ");
                            double credit = scan.nextDouble();
                            course.get(i).setCourseTitle(title);
                            course.get(i).setCredit(credit);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Id not found");
                    }
                } else if (com == 3) {
                    System.out.print("Faculty Id that you want to Update: ");
                    int id = scan.nextInt();
                    boolean isFound = false;
                    for (int i = 0; i < faculty.size(); i++) {
                        if (faculty.get(i).getFacultyId() == id) {
                            System.out.print("Faculty name(update): ");
                            String name = scan.next();
                            System.out.print("Faculty position(update): ");
                            String pos = scan.next();
                            faculty.get(i).setFacultyName(name);
                            faculty.get(i).setFacultyPosition(pos);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Id not found");
                    }
                }
                System.out.println("\n\n");
            } else if (in == 4) {
                commandListForPrint();
                int com = scan.nextInt();
                if (com == 1) {
                    for (int i = 0; i < student.size(); i++) {
                        System.out.println(student.get(i).toString());
                    }
                } else if (com == 2) {
                    for (int i = 0; i < course.size(); i++) {
                        System.out.println(course.get(i).toString());
                    }
                } else if (com == 3) {
                    for (int i = 0; i < faculty.size(); i++) {
                        System.out.println(faculty.get(i).toString());
                    }
                } else if (com == 4) {
                    System.out.print("Enter Student Id: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < student.size(); i++) {
                        if (id == student.get(i).getStudentId()) {
                            System.out.println(student.get(i).toString());
                            break;
                        }
                    }
                } else if (com == 5) {
                    System.out.print("Enter Course Id: ");
                    String id = scan.next();
                    for (int i = 0; i < course.size(); i++) {
                        if (id.equals(course.get(i).getCourseId())) {
                            System.out.println(course.get(i).toString());
                            break;
                        }
                    }
                } else if (com == 6) {
                    System.out.print("Enter Faculty Id: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < faculty.size(); i++) {
                        if (id == faculty.get(i).getFacultyId()) {
                            System.out.println(faculty.get(i).toString());
                            break;
                        }
                    }
                } else if (com == 7) {
                    System.out.print("Enter Course Id: ");
                    String id = scan.next();
                    for (int i = 0; i < course.size(); i++) {
                        if (id.equals(course.get(i).getCourseId())) {
                            System.out.println("Students: ");
                            course.get(i).printStudentList();
                            if (course.get(i).getFaculty() != null) {
                                System.out.println("Facult: ");
                                System.out.println(course.get(i).getFaculty().toString());
                            }
                            break;
                        }
                    }
                } else if (com == 8) {
                    System.out.print("Enter Student Id: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < course.size(); i++) {
                        for (int j = 0; j < course.get(i).getStudentList().size(); j++) {
                            if (course.get(i).getStudentList().get(j).getStudentId() == id) {
                                System.out.println(course.get(i).toString());
                                break;
                            }
                        }
                    }
                }
                System.out.println("\n\n");
            } else if (in == 5) {
                commandListForSearch();
                int com = scan.nextInt();
                if (com == 1) {
                    System.out.print("Enter Student Id: ");
                    int id = scan.nextInt();
                    boolean found = false;
                    for (int i = 0; i < student.size(); i++) {
                        if (id == student.get(i).getStudentId()) {
                            System.out.println(student.get(i).toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found");
                    }
                } else if (com == 2) {
                    System.out.print("Enter Course Id: ");
                    String id = scan.next();
                    boolean found = false;
                    for (int i = 0; i < course.size(); i++) {
                        if (id.equals(course.get(i).getCourseId())) {
                            System.out.println(course.get(i).toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Course not found");
                    }
                } else if (com == 3) {
                    System.out.print("Enter Faculty Id: ");
                    int id = scan.nextInt();
                    boolean found = false;
                    for (int i = 0; i < faculty.size(); i++) {
                        if (id == faculty.get(i).getFacultyId()) {
                            System.out.println(faculty.get(i).toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Faculty not found");
                    }
                } else if (com == 4) {
                    System.out.print("Enter Student id: ");
                    int stuId = scan.nextInt();
                    System.out.print("Ente Course id: ");
                    String courseId = scan.next();
                    boolean found = false;
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseId().equals(courseId)) {
                            for (int j = 0; j < course.get(i).getStudentList().size(); j++) {
                                if (course.get(i).getStudentList().get(j).getStudentId() == stuId) {
                                    found = true;
                                }
                            }
                        }
                    }
                    if (found) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else if (com == 5) {
                    System.out.print("Enter Faculty id: ");
                    int facId = scan.nextInt();
                    System.out.print("Ente Course id: ");
                    String courseId = scan.next();
                    boolean found = false;
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseId().equals(courseId)) {
                            if (course.get(i).getFaculty().getFacultyId() == facId) {
                                found = true;
                            }
                        }
                    }
                    if (found) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else if (com == 6) {
                    System.out.print("Enter Student Id: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < course.size(); i++) {
                        for (int j = 0; j < course.get(i).getStudentList().size(); j++) {
                            if (course.get(i).getStudentList().get(j).getStudentId() == id) {
                                System.out.println(course.get(i).toString());
                                break;
                            }
                        }
                    }
                } else if (com == 7) {
                    System.out.print("Enter Faculty Id: ");
                    int id = scan.nextInt();
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getFaculty().getFacultyId() == id) {
                            System.out.println(course.get(i).toString());
                        }
                    }
                }
                System.out.println("\n\n");
            } else if (in == 6) {
                System.out.print("Available List Of Student:");
                for (int i = 0; i < student.size(); i++) {
                    System.out.print(student.get(i).getStudentId() + " ");
                }
                System.out.println();

                System.out.print("Available List Of Courses:");
                for (int i = 0; i < course.size(); i++) {
                    System.out.print(course.get(i).getCourseId() + " ");
                }
                System.out.println();

                System.out.print("Enter Student id: ");
                int stuId = scan.nextInt();
                System.out.print("Enter Course id: ");
                String couId = scan.next();

                k:
                for (int i = 0; i < course.size(); i++) {
                    if (course.get(i).getCourseId().equals(couId)) {
                        for (int j = 0; j < student.size(); j++) {
                            if (student.get(j).getStudentId() == stuId) {
                                course.get(i).addStudent(student.get(j));
                                break k;
                            }
                        }
                    }
                }
                System.out.println("\n\n");
            } else if (in == 7) {
                System.out.print("Available List Of Facultu:");
                for (int i = 0; i < faculty.size(); i++) {
                    System.out.print(faculty.get(i).getFacultyId() + " ");
                }
                System.out.println();

                System.out.print("Available List Of Courses:");
                for (int i = 0; i < course.size(); i++) {
                    System.out.print(course.get(i).getCourseId() + " ");
                }
                System.out.println();

                System.out.print("Enter faculty id: ");
                int facId = scan.nextInt();
                System.out.print("Enter Course id: ");
                String couId = scan.next();

                k:
                for (int i = 0; i < course.size(); i++) {
                    if (course.get(i).getCourseId().equals(couId)) {
                        for (int j = 0; j < faculty.size(); j++) {
                            if (faculty.get(j).getFacultyId() == facId) {
                                course.get(i).addFaculty(faculty.get(j));
                                break k;
                            }
                        }
                    }
                }

                System.out.println("\n\n");
            } else if (in == 8) {
                break;
            }
        }

    }
}
