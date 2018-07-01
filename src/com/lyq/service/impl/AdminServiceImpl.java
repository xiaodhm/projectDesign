package com.lyq.service.impl;

import com.lyq.bean.Admin;
import com.lyq.dao.AdminDao;
import com.lyq.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }
    @Override
    public Admin select(int id,String password) {
        return adminDao.select(id,password);
    }
}
