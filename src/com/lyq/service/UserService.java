package com.lyq.service;

import com.lyq.bean.UserBean;

import java.util.List;

public interface UserService {
    public UserBean login(int id ,String password);
    public boolean insert(UserBean user);
}
