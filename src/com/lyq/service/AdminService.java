package com.lyq.service;

import com.lyq.bean.Admin;

public interface AdminService {
    public Admin select(int id,String password);
}
