package com.lyq.service;

import com.lyq.bean.Selector;

import java.util.List;

public interface SelectorService {
    public List<Object[]> queryAllSlctor();
    public void deleteBySlcId(int slcId);
    public void insert(Selector slctor);
    public List<Object[]> queryAllSlcCounts();
    public List<Object[]> querySlcCountsByUserId(int userId);
    public List<Object[]> queryAllSlc();

}
