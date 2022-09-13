package com.mycompany.springorm.dao;

import com.mycompany.springorm.entities.Student;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImpl implements StudentDao {

    private HibernateTemplate hibernateTemplete;

    @Override

    @Transactional

    public int insert(Student student) {
        return (Integer) hibernateTemplete.save(student);
    }

    public HibernateTemplate getHibernateTemplete() {
        return hibernateTemplete;
    }

    public void setHibernateTemplete(HibernateTemplate hibernateTemplete) {
        this.hibernateTemplete = hibernateTemplete;
    }

}
