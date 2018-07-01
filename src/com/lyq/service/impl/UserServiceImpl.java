package com.lyq.service.impl;

import com.lyq.bean.UserBean;
import com.lyq.dao.UserDao;
import com.lyq.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserBean login(int id,String password) {
        return userDao.login(id,password);
    }
    @Override
    public boolean insert(UserBean user) {
        return false;
    }
}
