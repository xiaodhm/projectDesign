package com.lyq.dao.impl;

import com.lyq.bean.Selector;
import com.lyq.bean.UserBean;
import com.lyq.bean.Vote;
import com.lyq.dao.VoteDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class VoteDaoImpl implements VoteDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate; }

    @Override
    public void insert(Selector selector, UserBean userBean) {
        hibernateTemplate.save(selector);
        hibernateTemplate.save(userBean);
    }
}
