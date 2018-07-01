package com.lyq.dao.impl;

import com.lyq.bean.Selector;
import com.lyq.dao.SelectorDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class SelectorDaoImpl implements SelectorDao{
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public List<Object[]> queryAllSlctor() {
        String hql="from Selector sl inner join sl.item Item";
        return (List<Object[]>)hibernateTemplate.find(hql);
    }
    @Override
    public void deleteBySlcId(int slcId) {
        Selector selector=hibernateTemplate.get(Selector.class,slcId);
        if(selector!=null){
            hibernateTemplate.delete(selector);
        }
    }
    @Override
    public void save(Selector slctor) {
        hibernateTemplate.save(slctor);
    }
    @Override
    public List<Object[]> queryAllSlcCounts() {
        String hql="select slc.oid,slc.content,Item.itemname,count(UserBean.usrid) from " +
                "Selector slc inner join slc.userBeans UserBean " +
                " inner join slc.item Item group by slc.oid";
        return (List<Object[]>)hibernateTemplate.find(hql);
    }
    @Override
    public List<Object[]> querySlcCountsByUserId(int userId) {
        String hql="select Selector.oid,Selector.content,Item.itemname,count(user.usrid) from UserBean " +
                "user inner join user.selectors Selector " +
                "inner join Selector.item Item where user.usrid=? " +
                "group by Selector.oid";
        return (List<Object[]>)hibernateTemplate.find(hql,userId);
    }
    @Override
    public List<Object[]> queryAllSlc() {
        String hql="select slc.oid,slc.content,Item.itemname,count(UserBean.usrid) from Selector slc " +
                "left join slc.userBeans UserBean " +
                " inner join slc.item Item group by slc.oid";
        return (List<Object[]>)hibernateTemplate.find(hql);
    }




}
