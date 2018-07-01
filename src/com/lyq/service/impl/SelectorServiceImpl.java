package com.lyq.service.impl;

import com.lyq.bean.Selector;
import com.lyq.dao.SelectorDao;
import com.lyq.service.SelectorService;

import java.util.List;

public class SelectorServiceImpl implements SelectorService {
    private SelectorDao selectorDao;
    public void setSelectorDao(SelectorDao selectorDao) {
        this.selectorDao = selectorDao;
    }

    @Override
    public List<Object[]> queryAllSlctor() {
        return selectorDao.queryAllSlctor();
    }
    @Override
    public void insert(Selector slctor) {
        selectorDao.save(slctor);
    }
    @Override
    public void deleteBySlcId(int slcId) {
        selectorDao.deleteBySlcId(slcId);
    }
    @Override
    public List<Object[]> queryAllSlcCounts() {
        return selectorDao.queryAllSlcCounts();
    }
    @Override
    public List<Object[]> querySlcCountsByUserId(int userId) {
        return selectorDao.querySlcCountsByUserId(userId);
    }

    @Override
    public List<Object[]> queryAllSlc() {
        return selectorDao.queryAllSlc();
    }
}
