package com.lyq.dao.impl;

import com.lyq.bean.Admin;
import com.lyq.dao.AdminDao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class AdminDaoImpl implements AdminDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate; }
    @Override
    public Admin select(int id,String password) {
        String hql="from Admin ad where ad.admid=? and ad.password=?";
        List<Admin> admins=(List<Admin>)hibernateTemplate.find(hql,id,password);
        return admins.size()>0?admins.get(0):null;
    }
}
