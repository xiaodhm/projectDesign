package com.lyq.dao;

import com.lyq.bean.UserBean;

import java.util.List;

public interface UserDao {
   // public UserBean queryById(int id);
    public UserBean login(int id,String password);
    public boolean insert(UserBean user);
}
