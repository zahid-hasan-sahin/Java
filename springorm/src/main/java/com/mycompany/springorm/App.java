package com.mycompany.springorm;

import com.mycompany.springorm.dao.StudentDao;
import com.mycompany.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ob = new ClassPathXmlApplicationContext("config.xml");
        StudentDao st = ob.getBean("studentDao", StudentDao.class);
        st.insert(new Student(1, "zahid", "Rajshahi"));
    }
}
