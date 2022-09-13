package com.mycompany.springjdbctest.Dao;

import com.mycompany.springjdbctest.Entities.Student;
import java.util.List;

public interface StudentDao {

    public int insert(Student student);

    public int change(Student student);

    public int delete(int studentId);

    public Student getStudent(int studentId);
    public List<Student> getAllStudent();
}
