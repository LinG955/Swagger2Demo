package com.ustc.service.impl;

import com.ustc.dao.UserDao;
import com.ustc.entity.User;
import com.ustc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIpml implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public boolean deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
