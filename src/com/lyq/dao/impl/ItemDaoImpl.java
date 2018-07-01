package com.lyq.dao.impl;

import com.lyq.bean.Item;
import com.lyq.dao.ItemDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class ItemDaoImpl implements ItemDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate; }
    @Override
    public List<Item> queryAlLitems() {
        String hql="from Item";
        return (List<Item>)hibernateTemplate.find(hql);
    }

    @Override
    public void save(Item item) {
        hibernateTemplate.save(item);
    }

    @Override
    public void deleteById(int itemId) {
        Item item=hibernateTemplate.get(Item.class,itemId);
        if(item!=null) {
            hibernateTemplate.delete(item);
        }
    }
}
