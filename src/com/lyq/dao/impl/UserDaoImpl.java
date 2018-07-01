package com.lyq.dao.impl;

import com.lyq.bean.UserBean;
import com.lyq.dao.UserDao;
import com.lyq.service.AdminService;
import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.List;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate; }
    @Override
    public UserBean login(int id,String password) {
        String hql="from UserBean user where user.usrid=? and user.password=?";
        List<UserBean> userBeans=(List<UserBean>)hibernateTemplate.find(hql,id,password);
        return userBeans.size()>0?userBeans.get(0):null;
    }

    @Override
    public boolean insert(UserBean user) {
        hibernateTemplate.save(user);
        return false;
    }
}
