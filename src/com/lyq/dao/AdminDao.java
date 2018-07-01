package com.lyq.dao;

import com.lyq.bean.Admin;

public interface AdminDao {
    public Admin select(int id,String password);
}
