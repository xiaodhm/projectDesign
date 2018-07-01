package com.lyq.service.impl;

import com.lyq.bean.Item;
import com.lyq.dao.ItemDao;
import com.lyq.service.ItemService;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDao;

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
    @Override
    public List<Item> queryAlLitems() {
        return itemDao.queryAlLitems();
    }
    @Override
    public void save (Item item) {
        itemDao.save(item);
    }
    @Override
    public void deleteById(int itemId) {
        itemDao.deleteById(itemId);
    }
}
