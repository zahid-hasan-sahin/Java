package com.mycompany.springcore;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    
    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    private double name;
    
     Student(){
        this.name = name;
    }
    
    Student(double name){
        this.name = name;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }

}
