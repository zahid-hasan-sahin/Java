package com.mycompany.springjdbctest;

import com.mycompany.springjdbctest.Dao.StudentDaoImp;
import com.mycompany.springjdbctest.Entities.Student;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDaoImp student = context.getBean("studentDaoImp", StudentDaoImp.class);

        List<Student> l = student.getAllStudent();
        for (Student i : l) {
            System.out.println(i);
        }
    }

}
