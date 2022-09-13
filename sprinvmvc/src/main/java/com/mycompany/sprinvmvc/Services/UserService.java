package com.mycompany.sprinvmvc.Services;

import com.mycompany.sprinvmvc.Dao.UserDao;
import com.mycompany.sprinvmvc.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    public String add(User user) {

        return userDao.insert(user);
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
