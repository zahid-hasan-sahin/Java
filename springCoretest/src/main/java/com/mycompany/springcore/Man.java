package com.mycompany.springcore;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Man {

    @Value("#{student}")
    private Student stu;
    private int age;

    public void setAge(int age) {
        System.out.println("Setting age");
        this.age = age;
    }

    public void setStu(Student stu) {
        System.out.println("Setting stud");
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Man{" + "age=" + age + ", stu=" + stu + '}';
    }
}
