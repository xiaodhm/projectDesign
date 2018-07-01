package com.lyq.service;

import com.lyq.bean.Item;

import java.util.List;

public interface ItemService {
    public List<Item> queryAlLitems();
    public void save(Item item);
    public void deleteById(int itemId);
}
