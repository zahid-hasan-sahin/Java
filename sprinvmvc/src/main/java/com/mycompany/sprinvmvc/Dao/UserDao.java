package com.mycompany.sprinvmvc.Dao;

import com.mycompany.sprinvmvc.Entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDao {
    
    @Autowired
    private HibernateTemplate hibernateTemplate;

     @Transactional
    public String insert(User user) {
        
        return (String) hibernateTemplate.save(user);
    }

    public UserDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    
}
