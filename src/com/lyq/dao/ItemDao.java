package com.lyq.dao;

import com.lyq.bean.Item;

import java.util.List;

public interface ItemDao {
    public List<Item> queryAlLitems();
    public void save(Item item);
    public void deleteById(int itemId);
}
