package com.lyq.dao;

import com.lyq.bean.Selector;

import java.util.List;

public interface SelectorDao {
    public List<Object[]> queryAllSlctor();
    public void deleteBySlcId(int slcId);
    public void save(Selector slctor);
    public List<Object[]> queryAllSlcCounts();
    public List<Object[]> querySlcCountsByUserId(int userId);
    public List<Object[]> queryAllSlc();
}
